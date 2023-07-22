package com.factory.factoryMethod.controller;


import com.factory.factoryMethod.factory.FreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.DiscountFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.SmallGiftFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.YouKuMemberFreeGoodsFactory;
import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.publiccom.service.IFreeGoods;

public class DeliverController {
    public ResponseResult awardToUser(AwardInfo awardInfo){
        FreeGoodsFactory freeGoodsFactory=null;
        if(awardInfo.getAwardType()==1){
            freeGoodsFactory = new DiscountFreeGoodsFactory();
        } else if (awardInfo.getAwardType()==2) {
            freeGoodsFactory =new SmallGiftFreeGoodsFactory();
        }else if(awardInfo.getAwardType()==3){
            freeGoodsFactory = new YouKuMemberFreeGoodsFactory();
        }
        IFreeGoods instance = freeGoodsFactory.getInstance();
        ResponseResult responseResult = instance.sendFreeGoods(awardInfo);
        return responseResult;
    }
}
