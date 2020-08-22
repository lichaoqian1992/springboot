package com.lcq.designpatterns.action.state;

/**
 * @ClassName: BlackVoteState
 * @Description: 具体状态类——黑名单
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:42
 * @Version: 1.0
 **/
public class BlackVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 记录黑名单，禁止登陆系统
        System.out.println("进入黑名单，将禁止登陆和使用本系统");
    }
}
