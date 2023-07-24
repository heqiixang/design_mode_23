package com.factory.none.service;

import com.factory.publiccom.entity.DiscountResult;

public class YouKuMemberService {
    public DiscountResult openMember(String bindMobile , String number){

        System.out.println("发放优酷会员: " + bindMobile + " , " + number);
        return new DiscountResult("200","发放打折券成功");
    }
}
