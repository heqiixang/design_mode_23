package com.bridge;

/**
 * 支付接口
 */
public interface IPayMode {
    //安全校验
    public Boolean security(String uId);
}
