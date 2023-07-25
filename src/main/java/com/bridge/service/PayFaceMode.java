package com.bridge.service;

import com.bridge.IPayMode;

public class PayFaceMode implements IPayMode {
    @Override
    public Boolean security(String uId) {
        System.out.println("人脸支付->风控校验");
        return true;
    }
}
