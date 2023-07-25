package com.bridgepattern.service;

import com.bridgepattern.IPayMode;

import java.math.BigDecimal;

/**
 * 支付抽象类
 */
public abstract class Pay {
    public IPayMode iPayMode;

    public Pay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }
    //转账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
