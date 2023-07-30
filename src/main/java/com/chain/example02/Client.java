package com.chain.example02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/14
 **/
public class Client {

    public static void main(String[] args) throws ParseException {
        AuthController controller = new AuthController();

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
        Date authDate = f.parse("2022-11-12 00:00:00");

        //设置申请审核时间
        AuthInfo info1 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info1.getInfo() + "--> 三级负责人郭组长已审批");
        AuthService.auth("1000013","1001198819771966");

        AuthInfo info2 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info2.getInfo() + "--> 二级负责人王经理已审批");
        AuthService.auth("1000012","1001198819771966");

        AuthInfo info3 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info3.getInfo() + "--> 一级负责人罗总已审批");
        AuthService.auth("1000011","1001198819771966");

        System.out.println("\n审批完成!");
    }
}
