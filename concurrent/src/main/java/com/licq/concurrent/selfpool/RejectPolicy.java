package com.licq.concurrent.selfpool;

import com.licq.concurrent.selfpool.impl.MyThreadPoolExecutor;

/**
 * @ClassName: RejectPolicy
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/7/30 19:46
 * @Version: 1.0
 **/
public interface RejectPolicy {

    void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor);
}
