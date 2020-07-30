package com.licq.concurrent.selfpool;

import com.licq.concurrent.selfpool.impl.DiscardRejectPolicy;
import com.licq.concurrent.selfpool.impl.MyThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: MyThreadPoolExecutorTest
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/7/30 20:04
 * @Version: 1.0
 **/
public class MyThreadPoolExecutorTest {
    public static void main(String[] args) {
        Executor threadPool = new MyThreadPoolExecutor("test", 5, 10, new ArrayBlockingQueue<>(15), new DiscardRejectPolicy());
        AtomicInteger num = new AtomicInteger(0);
        for (int i = 0; i < 100; i++) {
            threadPool.execute(() -> {
                try {
//                    Thread.sleep(1000);
                    System.err.println("running: " + System.currentTimeMillis() + ":" + num.getAndIncrement());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
