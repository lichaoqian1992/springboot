package com.licq.concurrent.config;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName: SimpleDemo
 * @Description: 简化的线程池，仅用来说明工作原理
 * @Author: lichaoqian
 * @Date: 2020/7/30 13:58
 * @Version: 1.0
 **/
public class MyThreadPool {
    // 利用阻塞队列实现生产者-消费者模式
    BlockingQueue<Runnable> workQueue;
    // 保存内部工作线程
    List<WorkerThread> threads = new ArrayList<>();

    /**
     * 构造方法
     * @param poolSize
     * @param workQuere
     */
    public MyThreadPool(int poolSize, BlockingQueue<Runnable> workQuere) {
        this.workQueue = workQuere;
        // 创建工作线程
        for (int idx = 0; idx < poolSize; idx++) {
            WorkerThread work = new WorkerThread();
            work.start();
            threads.add(work);
        }
    }

    /**
     * 提交任务
     * @param command
     * @throws InterruptedException
     */
    public void execute(Runnable command) throws InterruptedException {
        workQueue.put(command);
    }

    // 工作线程负责消费任务，并执行任务
    class WorkerThread extends Thread {
        @Override
        public void run() {
            // 循环取任务并执行
            while(true) {
                Runnable task = null;
                try {
                    task = workQueue.take();
                    System.out.println("11111");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.run();
            }
        }
    }

    /** 下面是使用实例**/
//    BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(2);

    // 创建线程池
//    MyThreadPool pool = new MyThreadPool(10, queue);
    // 提交任务
//    pool.execute(() -> {
//        System.out.println("hello");
//    });
}
