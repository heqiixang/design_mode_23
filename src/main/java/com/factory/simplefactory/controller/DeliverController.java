package com.factory.simplefactory.controller;


import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.simplefactory.factory.FreeGoodsFactory;
import com.factory.publiccom.service.IFreeGoods;

public class DeliverController {
    public ResponseResult awardToUser(AwardInfo awardInfo){
        IFreeGoods instance = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
        ResponseResult responseResult = instance.sendFreeGoods(awardInfo);
        return responseResult;
    }
}
