package com.bridge.service;

import com.bridge.IPayMode;

import java.math.BigDecimal;

public class ZfbPay extends Pay{
    public ZfbPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付付款开始。。。。。。。。。。。。。。。。");
        Boolean security = iPayMode.security(uId);
        System.out.println("支付宝渠道支付风险校验。。。。。。。。。。。。。。。。。。"+uId+tradeId+amount);
        if(!security){
            System.out.println("支付宝渠道支付付款失败");
            return "500";
        }
        System.out.println("支付宝支付付款成功");
        return "200";
    }
}
