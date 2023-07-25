package com.bridgepattern.service;

import com.bridgepattern.IPayMode;

/**
 * 指纹支付
 */
public class PayFingerprintMode implements IPayMode {
    @Override
    public Boolean security(String uId) {
        System.out.println("z指纹支付-风控校验—>");
        return true;
    }
}
