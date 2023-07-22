package com.factory.publiccom.service.impl;

import com.alibaba.fastjson.JSON;
import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.publiccom.entity.SmallGiftInfo;
import com.factory.publiccom.service.IFreeGoods;


import java.util.UUID;

/**
 * 模拟礼品服务

 **/
public class SmallGiftFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品已发货,获奖用户注意查收! " + JSON.toJSON(smallGiftInfo));
        return new ResponseResult("200","赠品: 小礼物发放成功!",smallGiftInfo);
    }

}
