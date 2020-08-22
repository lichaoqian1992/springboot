package com.lcq.designpatterns.action.state;

/**
 * @ClassName: NormalVoteState
 * @Description: 具体状态类——正常投票
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:30
 * @Version: 1.0
 **/
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票，记录到投票纪录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}
