package com.chain.example02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthController {

    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {

        //三级审批
        Date date = null;
        date = AuthService.queryAuthInfo("1000013", orderId);

        if(date == null){
            return new AuthInfo("0001","单号:",orderId,"状态:待三级审批负责人郭组长审批");
        }

        //二级审批
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
        //审核范围是在11-01日 ~ 11-25日
        if(authDate.after(f.parse("2022-11-01 00:00:00")) && authDate.before(f.parse("2022-11-25 00:00:00"))){
            date = AuthService.queryAuthInfo("1000012",orderId);
            if(date == null){
                return new AuthInfo("0001","单号:",orderId,"状态: 待二级审批负责人王经理审批");
            }
        }

        //一级审批
        //审核范围是在11-11日 ~ 11-17日
        if(authDate.after(f.parse("2022-11-11 00:00:00")) && authDate.before(f.parse("2022-11-17 00:00:00"))){
            date = AuthService.queryAuthInfo("1000011",orderId);
            if(date == null){
                return new AuthInfo("0001","单号:",orderId,"状态: 待一级审批负责人罗总审批");
            }
        }

        return new AuthInfo("0001","单号 : " ,orderId," 状态:审批完成");
    }
}
