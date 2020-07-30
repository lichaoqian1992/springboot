package com.licq.concurrent.selfpool.impl;

import com.licq.concurrent.selfpool.RejectPolicy;

/**
 * @ClassName: DiscardRejectPolicy
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/7/30 19:47
 * @Version: 1.0
 **/
public class DiscardRejectPolicy implements RejectPolicy {
    @Override
    public void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor) {
        System.out.println("discard one task" + 1/0);
    }
}
