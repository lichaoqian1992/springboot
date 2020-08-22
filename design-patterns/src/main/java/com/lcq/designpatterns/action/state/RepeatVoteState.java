package com.lcq.designpatterns.action.state;

/**
 * @ClassName: RepeatVoteState
 * @Description: 具体状态类——重复投票
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:39
 * @Version: 1.0
 **/
public class RepeatVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }
}
