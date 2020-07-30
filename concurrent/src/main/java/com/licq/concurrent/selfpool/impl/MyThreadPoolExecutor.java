package com.licq.concurrent.selfpool.impl;

import com.licq.concurrent.selfpool.Executor;
import com.licq.concurrent.selfpool.RejectPolicy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: MyThreadPoolExecutor
 * @Description: 自动动手写一个线程池
 * @Author: lichaoqian
 * @Date: 2020/7/30 19:44
 * @Version: 1.0
 **/
public class MyThreadPoolExecutor implements Executor {

    /**
     * 线程池的名称
     */
    private String name;

    /**
     * 线程序列号
     */
    private AtomicInteger sequence = new AtomicInteger(0);

    /**
     * 核心线程数
     */
    private int coreSize;

    /**
     * 最大线程数
     */
    private int maxSize;

    /**
     * 任务队列
     */
    private BlockingQueue<Runnable> taskQueue;

    /**
     * 拒绝策略
     */
    private RejectPolicy rejectPolicy;

    /**
     * 当前正在运行的线程数
     * 需要修改时线程间立即感知，所以使用AtomicInteger
     * 或者也可以使用volatile并结合Unsafe做CAS操作
     */
    private AtomicInteger runningCount = new AtomicInteger(0);

    /**
     * 构造器
     * @param name
     * @param coreSize
     * @param maxSize
     * @param taskQueue
     * @param rejectPolicy
     */
    public MyThreadPoolExecutor(String name, int coreSize, int maxSize, BlockingQueue<Runnable> taskQueue, RejectPolicy rejectPolicy) {
        this.name = name;
        this.coreSize = coreSize;
        this.maxSize = maxSize;
        this.taskQueue = taskQueue;
        this.rejectPolicy = rejectPolicy;
    }

    @Override
    public void execute(Runnable task) {
        // 正在运行的线程数
        int count = runningCount.get();
        // 如果正在运行的线程数小于核心线程数，直接加一个线程
        if (count < coreSize) {
            // 注意，这里不一定添加成功，addWorker()方法里面还要判断一次是不是确实小于
            if (addWorker(task, true)) {
                return;
            }
        }
    }

    private boolean addWorker(Runnable newTask, boolean core) {
        // 自旋判断是不是真的可以创建一个线程
        for (;;) {
            // 正在运行的线程数
            int count = runningCount.get();
            // 核心线程还是非核心线程
            int max = core ? coreSize : maxSize;
            // 不满足创建线程的条件，直接返回false
            if (count >= max) {
                return false;
            }
            // 修改runningCount成功，可以创建线程
            if (runningCount.compareAndSet(count, count + 1)) {
                // 线程的名字
                String threadName = (core ? "core_" : "simple_") + name + sequence.incrementAndGet();
                // 创建线程并启动
                new Thread(() -> {
                    System.out.println("thread name:" + Thread.currentThread().getName());
                    // 运行的任务
                    Runnable task = newTask;
                    // 不断从任务队列中取任务执行，如果取出来的任务时null,则跳出循环，线程也就结束了
                    while (task != null || (task = getTask()) != null) {
                        try {
                            // 执行任务
                            task.run();
                        } finally {
                            // 任务执行完成，置为空
                            task = null;
                        }
                    }
                }, threadName).start();
                break;
            }
        }
        return true;
    }

    /**
     * 从队列里取出任务
     * @return
     */
    private Runnable getTask() {
        try {
            // take()方法会一直阻塞知道取到任务为止
            return taskQueue.take();
        } catch (InterruptedException e) {
            // 线程中断了，返回null可以结束当前线程
            // 当前线程都要结束了，理应吧runningCount的数量减一
            runningCount.decrementAndGet();
            return null;
        }
    }

}
