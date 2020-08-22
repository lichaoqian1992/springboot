package com.lcq.designpatterns.action.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: Memento
 * @Description: 备忘录角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:04
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
public class Memento {

    private String state;
}
