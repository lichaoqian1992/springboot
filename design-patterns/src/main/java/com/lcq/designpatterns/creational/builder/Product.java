package com.lcq.designpatterns.creational.builder;

import lombok.Data;

/**
 * @ClassName: Product
 * @Description: 产品（麦当劳套餐）
 * @Author: lichaoqian
 * @Date: 2020/8/19 13:41
 * @Version: 1.0
 **/
@Data
public class Product {

    private String  buildA = "汉堡";
    private String  buildB = "饮料";
    private String  buildC = "薯条";
    private String  buildD = "甜品";

}
