package com.chain.example03;

import java.util.Date;
import com.chain.example02.AuthInfo;
import com.chain.example02.AuthService;


public class Level3AuthLink extends AuthLink {

    public Level3AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    public AuthInfo doAuth(String uId, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0002", "单号：", orderId, " 状态：三级审批完成负责人", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
