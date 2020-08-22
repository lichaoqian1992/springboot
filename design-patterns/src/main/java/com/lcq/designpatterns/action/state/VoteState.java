package com.lcq.designpatterns.action.state;

/**
 * @ClassName: VoteState
 * @Description: 抽象状态类
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:27
 * @Version: 1.0
 **/
public interface VoteState {

    /**
     * 处理状态对应的行为
     * @param user 投票人
     * @param voteItem 投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，可以回掉上下文的数据
     */
    void vote(String user, String voteItem, VoteManager voteManager);
}
