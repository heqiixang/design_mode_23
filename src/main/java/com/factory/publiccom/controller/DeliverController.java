package com.factory.publiccom.controller;


import com.alibaba.fastjson.JSON;
import com.factory.factoryMethod.factory.FreeGoodsFactory;
import com.factory.factoryMethod.factory.FreeGoodsFactoryMap;
import com.factory.factoryMethod.factory.impl.DiscountFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.SmallGiftFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.YouKuMemberFreeGoodsFactory;
import com.factory.none.service.DiscountService;
import com.factory.none.service.SmallGiftService;
import com.factory.none.service.YouKuMemberService;
import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.DiscountResult;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.publiccom.entity.SmallGiftInfo;
import com.factory.publiccom.service.IFreeGoods;

import java.util.UUID;

public class DeliverController {
    /**
     * 没使用设计模式
     * @param awardInfo
     */
    public void awardToUser(AwardInfo awardInfo){

        if(awardInfo.getAwardType() == 1){ //打折券
            DiscountService discountService = new DiscountService();
            DiscountResult result = discountService.sendDiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功!"+ JSON.toJSON(result));

        }else if(awardInfo.getAwardType() == 2){ //优酷会员
            //获取用户手机号
            String bindMobile = awardInfo.getExtMap().get("phone");

            //调用service
            YouKuMemberService youKuMemberService = new YouKuMemberService();
            DiscountResult result = youKuMemberService.openMember(bindMobile, awardInfo.getAwardNumber());
            System.out.println("优酷会员发放成功!"+JSON.toJSON(result));

        }else if(awardInfo.getAwardType() == 3){
            SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
            smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
            smallGiftInfo.setOrderId(UUID.randomUUID().toString());
            smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("adderss"));

            SmallGiftService smallGiftService = new SmallGiftService();
            DiscountResult result = smallGiftService.giveSmallGift(smallGiftInfo);

            System.out.println("小礼品发放成功!" + JSON.toJSON(result));
        }
    }


    /**
     * 简单工厂
     * @param awardInfo
     * @return
     */
    public ResponseResult simpleFactory(AwardInfo awardInfo){
        IFreeGoods instance = com.factory.simplefactory.factory.FreeGoodsFactory.getInstance(awardInfo.getAwardType());
        ResponseResult responseResult = instance.sendFreeGoods(awardInfo);
        return responseResult;
    }

    /**
     * 工厂方法
     * @param awardInfo
     * @return
     */
    public ResponseResult factoryMethodAward(AwardInfo awardInfo){
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
        System.out.println(JSON.toJSON(responseResult));
        return responseResult;

    }

    /**
     * 工厂方法升级
     * @param awardInfo
     * @return
     */
    public ResponseResult abstractFactoryAward(AwardInfo awardInfo){
        FreeGoodsFactory freeGoodsFactory = FreeGoodsFactoryMap.getFreeGoodsFactory(awardInfo.getAwardType());
        IFreeGoods instance = freeGoodsFactory.getInstance();
        ResponseResult responseResult = instance.sendFreeGoods(awardInfo);
        System.out.println(JSON.toJSON(responseResult));
        return responseResult;
    }
}
