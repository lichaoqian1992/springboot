package com.lcq.designpatterns.action.state;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: VoteManager
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:29
 * @Version: 1.0
 **/
public class VoteManager {

    // 持有状态处理的对象
    private VoteState state;

    // 记录用户投票的结果，Map<用户名称，投票的选项>
    private Map<String, String> mapVote = new HashMap<>();

    // 记录用户投票次数，Map<用户名称，投票的次数>
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取用户投票结果的Map
     * @return
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     * @param user 投票人
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        // 1.为该用户增加投票的次数
        // 从记录中去除该用户已有的投票次数
        Integer oldVoteCount = mapVoteCount.getOrDefault(user, 0);
        oldVoteCount++;
        mapVoteCount.put(user, oldVoteCount);

        //2.判断该用户的投票类型，就相当于判断对应的状态
        // 到底是正常投票，重复投票，恶意投票还是上黑名单状态
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }
        // 然后转调对象状态来进行相应的操作
        state.vote(user, voteItem, this);
    }
}
