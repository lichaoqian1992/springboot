package com.lcq.algorithmic;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassName: Beer
 * @Description: 喝啤酒算法
 * @Author: lichaoqian
 * @Date: 2020/9/1 10:00
 * @Version: 1.0
 **/
public class Beer {

    int countOfDrinked;
    Stack<String> stackStep = new Stack<String>();
    String logOutputMax = "";

    LinkedList<String> linkedList = new LinkedList<String>();
    private static final int PRICE_EACH_BOTTLE = 2; //一瓶酒多少钱
    private static final int BOTTLE_CAN_CHANGE = 2; //多少瓶子能换一瓶酒
    private static final int CAP_CAN_CHANGE = 4; //多少瓶盖能换一瓶酒


    public int countOfDrink(int money) {
        linkedList.clear();
        calcMax(money, 0, 0, 0);
        System.out.println(String.join(";\n", linkedList));
        return linkedList.size();
    }

    public int countOfDrinkRecursive(int money) {
        countOfDrinked = 0;
        stackStep.clear();
        logOutputMax = "";
        calcMaxRecursive(money, 0, 0, 0);
        System.out.println(logOutputMax);
        return countOfDrinked;
    }

    int calcMaxRecursive(int money, int bottle, int cap, int drinked) {
        if (money >= PRICE_EACH_BOTTLE) {
            String log = "";
            log += "动作：买入啤酒，";
            log += "剩余金钱：" + (money - PRICE_EACH_BOTTLE) + ", ";
            log += "剩余酒瓶：" + (bottle + 1) + ", ";
            log += "剩余瓶盖：" + (cap + 1) + ", ";
            log += "已喝啤酒：" + (drinked + 1);
            stackStep.push(log);
            calcMaxRecursive(money - PRICE_EACH_BOTTLE, bottle + 1, cap + 1, drinked + 1);
            stackStep.pop();
        }

        if (bottle >= BOTTLE_CAN_CHANGE) {
            String log = "";
            log += "动作：酒瓶换酒, ";
            log += "剩余金钱： " + (money) + ", ";
            log += "剩余酒瓶：" + (bottle - BOTTLE_CAN_CHANGE + 1) + ", ";
            log += "剩余瓶盖：" + (cap + 1) + ", ";
            log += "已喝啤酒：" + (drinked + 1);
            stackStep.push(log);
            calcMaxRecursive(money, bottle - BOTTLE_CAN_CHANGE + 1, cap + 1, drinked + 1);
            stackStep.pop();
        } else if (cap >= CAP_CAN_CHANGE) {
            String log = "";
            log += "动作：瓶盖换酒, ";
            log += "剩余金钱： " + (money) + ", ";
            log += "剩余酒瓶：" + (bottle + 1) + ", ";
            log += "剩余瓶盖：" + (cap - CAP_CAN_CHANGE + 1) + ", ";
            log += "已喝啤酒：" + (drinked + 1);
            stackStep.push(log);
            calcMaxRecursive(money, bottle + 1, cap - CAP_CAN_CHANGE + 1, drinked + 1);
            stackStep.pop();
        }
        if (money < 2 && bottle < 2 && cap < 4) {
            if (drinked > countOfDrinked) {
                countOfDrinked = drinked;
                logOutputMax = String.join(";\n", stackStep);
            }
        }
        return drinked;
    }

    int calcMax(int money, int bottle, int cap, int drinked) {
        while (money >= PRICE_EACH_BOTTLE) {
            String log = "";
            log += "动作：买入啤酒，";
            log += "剩余金钱：" + (money - PRICE_EACH_BOTTLE) + ", ";
            log += "剩余酒瓶：" + (bottle + 1) + ", ";
            log += "剩余瓶盖：" + (cap + 1) + ", ";
            log += "已喝啤酒：" + (drinked + 1);
            linkedList.add(log);
            money -= PRICE_EACH_BOTTLE;
            bottle++;
            cap++;
            drinked++;
        }

        while (true) {
            if (bottle >= BOTTLE_CAN_CHANGE) {
                String log = "";
                log += "动作：酒瓶换酒, ";
                log += "剩余金钱： " + (money) + ", ";
                log += "剩余酒瓶：" + (bottle - BOTTLE_CAN_CHANGE + 1) + ", ";
                log += "剩余瓶盖：" + (cap + 1) + ", ";
                log += "已喝啤酒：" + (drinked + 1);
                linkedList.add(log);
                bottle = bottle - BOTTLE_CAN_CHANGE + 1;
                cap++;
                drinked++;
            } else if (cap >= CAP_CAN_CHANGE) {
                String log = "";
                log += "动作：瓶盖换酒, ";
                log += "剩余金钱： " + (money) + ", ";
                log += "剩余酒瓶：" + (bottle + 1) + ", ";
                log += "剩余瓶盖：" + (cap - CAP_CAN_CHANGE + 1) + ", ";
                log += "已喝啤酒：" + (drinked + 1);
                linkedList.add(log);
                bottle++;
                cap = cap - CAP_CAN_CHANGE + 1;
                drinked++;
            } else {
                break;
            }
        }
        return drinked;
    }

    public static void main(String[] args) {
        Beer beer = new Beer();
//        beer.countOfDrink(10);
        beer.countOfDrinkRecursive(10);
    }
}
