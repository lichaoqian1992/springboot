package com.lcq.designpatterns.action.responsibilitychain;

import lombok.Data;

/**
 * @ClassName: Handle
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:11
 * @Version: 1.0
 **/
@Data
public abstract class Handler {
    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    /**
     * @description 处理聚餐费用的请求
     * @date 2020/8/19 15:13
     * @param user 申请人
     * @param fee  申请的钱数
     * @return java.lang.String 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user, double fee);
}
