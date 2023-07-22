package com.factory.simplefactory.factory;

import com.factory.publiccom.service.IFreeGoods;
import com.factory.publiccom.service.impl.DiscountFreeGoods;
import com.factory.publiccom.service.impl.SmallGiftFreeGoods;
import com.factory.publiccom.service.impl.YouKuMemberFreeGoods;

public class FreeGoodsFactory {
    public static IFreeGoods getInstance(Integer awardType){
        IFreeGoods iFreeGoods = null;
        if(awardType==1){
            iFreeGoods=new DiscountFreeGoods();
        } else if (awardType==2) {
            iFreeGoods = new YouKuMemberFreeGoods();
        } else if (awardType==3) {
            iFreeGoods = new SmallGiftFreeGoods();
        }
            return iFreeGoods;
    }
}
