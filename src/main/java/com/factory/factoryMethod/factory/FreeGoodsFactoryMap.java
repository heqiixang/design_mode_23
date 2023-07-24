package com.factory.factoryMethod.factory;

import com.factory.factoryMethod.factory.impl.DiscountFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.SmallGiftFreeGoodsFactory;
import com.factory.factoryMethod.factory.impl.YouKuMemberFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

public class FreeGoodsFactoryMap {
    private static final Map<Integer,FreeGoodsFactory> cachedFactories =new HashMap<>();
    static {
        cachedFactories.put(1,new DiscountFreeGoodsFactory());
        cachedFactories.put(2,new SmallGiftFreeGoodsFactory());
        cachedFactories.put(3,new YouKuMemberFreeGoodsFactory());
    }
    public static FreeGoodsFactory getFreeGoodsFactory(Integer type){
        FreeGoodsFactory freeGoodsFactory = null;
        if(type==1){
            freeGoodsFactory=cachedFactories.get(1);
        }else if(type==2){
            freeGoodsFactory=cachedFactories.get(2);
        }else if(type==3){
            freeGoodsFactory=cachedFactories.get(3);
        }
        return freeGoodsFactory;
    }
}
