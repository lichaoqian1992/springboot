package com.lcq.designpatterns.action.state;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:45
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 10; i++) {
            vm.vote("u1", "A");
        }
    }
}
