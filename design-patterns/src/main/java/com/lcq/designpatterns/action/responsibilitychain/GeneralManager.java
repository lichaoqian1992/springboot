package com.lcq.designpatterns.action.responsibilitychain;

/**
 * @ClassName: GeneralManager
 * @Description: 总经理
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:14
 * @Version: 1.0
 **/
public class GeneralManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        // 总经理的权限很大，只要请求到了这里，他都可以处理
        if (fee >= 1000) {
            // 为了测试简单点，只同意张三的请求
            if ("张三".equals(user)) {
                str = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                // 其他人一律不同意
                str = "失败：总经理不同意【" + user + "】的聚餐费用，金额为" +fee + "元";
            }
        } else {
            // 超过1000，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
