package com.factory.none.service;

import com.factory.publiccom.entity.DiscountResult;

public class DiscountService {
    public DiscountResult sendDiscount(String uid, String number){

        System.out.println("向用户发放打折券一张: " + uid + " , " + number);
        return new DiscountResult("200","发放打折券成功");
    }
}
