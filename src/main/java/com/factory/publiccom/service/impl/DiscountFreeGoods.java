package com.factory.publiccom.service.impl;

import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.publiccom.service.IFreeGoods;

/**
 * 模拟打折券服务
 **/
public class DiscountFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        System.out.println("向用户发放打折券一张: " + awardInfo.getUid() + " , " + awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功!");
    }

}
