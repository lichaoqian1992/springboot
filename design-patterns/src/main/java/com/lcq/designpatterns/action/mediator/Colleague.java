package com.lcq.designpatterns.action.mediator;

/**
 * @ClassName: Colleague
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 9:44
 * @Version: 1.0
 **/
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
