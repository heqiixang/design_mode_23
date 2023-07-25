package com.bridge.service;

import com.bridge.IPayMode;

public class PayCypher implements IPayMode {
    @Override
    public Boolean security(String uId) {
        System.out.println("密码支付->风控校验");
        return true;
    }
}
