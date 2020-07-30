package com.licq.concurrent;

import com.licq.concurrent.config.MyThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/7/30 14:13
 * @Version: 1.0
 **/
public class Test {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(2);

        // 创建线程池
        MyThreadPool pool = new MyThreadPool(10, queue);
        // 提交任务
        pool.execute(() ->
                {
                    System.out.println("hello");
                }
        );

    }
}
