package com.lcq.designpatterns.action.state;

/**
 * @ClassName: SpiteVoteState
 * @Description: 具体状态类-恶意投票
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:40
 * @Version: 1.0
 **/
public class SpiteVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 恶意投票，取消用户的投票资格，并取消投票纪录
        String str = voteManager.getMapVote().get(user);
        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票的行为，取消投票资格");
    }
}
