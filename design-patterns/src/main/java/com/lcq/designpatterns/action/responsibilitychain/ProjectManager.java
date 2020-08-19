package com.lcq.designpatterns.action.responsibilitychain;

/**
 * @ClassName: ProjectManager
 * @Description: 项目经理
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:14
 * @Version: 1.0
 **/
public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        // 项目经理权限比较小，只能500以内
        if (fee < 500) {
            // 为了测试简单点，只同意张三的请求
            if ("张三".equals(user)) {
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                // 其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" +fee + "元";
            }
        } else {
            // 超过500，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
