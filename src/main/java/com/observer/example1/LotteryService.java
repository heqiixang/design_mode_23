package com.observer.example1;

/**
 * 开奖服务接口
 **/
public interface LotteryService {

    //摇号相关业务
    public LotteryResult lottery(String uId);
}
