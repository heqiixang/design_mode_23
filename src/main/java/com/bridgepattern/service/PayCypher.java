package com.bridgepattern.service;

import com.bridgepattern.IPayMode;

public class PayCypher implements IPayMode {
    @Override
    public Boolean security(String uId) {
        System.out.println("密码支付->风控校验");
        return true;
    }
}
