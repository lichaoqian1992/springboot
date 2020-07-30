package com.licq.concurrent.selfpool;

/**
 * @ClassName: Executor
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/7/30 19:43
 * @Version: 1.0
 **/
public interface Executor {

    void execute(Runnable command);
}
