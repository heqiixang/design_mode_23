package com.factory.publiccom.service.impl;
import com.factory.publiccom.entity.AwardInfo;
import com.factory.publiccom.entity.ResponseResult;
import com.factory.publiccom.service.IFreeGoods;
/**
 * 模拟优酷会员服务
 **/
public class YouKuMemberFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("会员绑定成功,手机号: " + phone);
        return new ResponseResult("200","赠品: 优酷会员发放成功!");
    }
}
