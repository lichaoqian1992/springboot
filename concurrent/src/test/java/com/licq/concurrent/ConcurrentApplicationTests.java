package com.licq.concurrent;

import com.licq.concurrent.config.MyThreadPool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

@SpringBootTest
class ConcurrentApplicationTests {

    @Autowired
    ThreadPoolTaskExecutor threadPoolTaskExecutor;

    /**
     * runAsync
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    void contextLoads() {
//    BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(2);
//
//         // 创建线程池
//    MyThreadPool pool = new MyThreadPool(10, queue);
//         // 提交任务
//    pool.execute(() -> {
//        System.out.println("hello");
//    });

    }

}
