package com.forezp.mongodb.test;


import com.alibaba.fastjson.JSON;
import com.forezp.mongodb.entity.Customer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
//        System.out.println("列表中最大的数 : " + stats.getMax());
//        System.out.println("列表中最小的数 : " + stats.getMin());
//        System.out.println("所有数之和 : " + stats.getSum());
//        System.out.println("平均数 : " + stats.getAverage());
//        BitSet bitSet = new BitSet();
//        Map map = new HashMap<>();
//        Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
        Customer people = null;
        Optional.ofNullable(people)
                //...可以有无穷个中间操作
                .filter(p->p.getFirstName().startsWith("侠梦的开发笔记"))
                .map(p->p.getLastName())
                //终端操作,消费掉
                .ifPresent(System.out::print);
    }
}
