package com.licq.concurrent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池配置
 */
@Configuration
public class ExecutePoolConfiguration {

    // 核心线程池数
    private static final int corePoolSize = 10;

    // 最大线程
    private static final  int maxPoolSize = 20;

    // 队列容量
    private static final  int queueCapacity = 32;

    // 允许的空闲时间
    private static final  int keepAliveSeconds = 20;

    @Bean(name="threadPoolTaskExecutor")
    public ThreadPoolTaskExecutor threadPoolTaskExecutor(){
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();

        // 核心线程池数
        pool.setCorePoolSize(corePoolSize);
        // 最大线程
        pool.setMaxPoolSize(maxPoolSize);
        // 队列容量
        pool.setQueueCapacity(queueCapacity);
        // 允许的空闲时间
        pool.setKeepAliveSeconds(keepAliveSeconds);
        //队列满，线程被拒绝执行策略
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return pool;
    }

}
