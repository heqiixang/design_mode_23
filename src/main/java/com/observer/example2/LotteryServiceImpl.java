package com.observer.example2;


import com.observer.example1.DrawHouseService;
import com.observer.example1.LotteryResult;

import java.util.Date;

/**
 * 开奖服务
 **/
public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}
