package com.factory.factoryMethod.factory.impl;

import com.factory.factoryMethod.factory.FreeGoodsFactory;
import com.factory.publiccom.service.IFreeGoods;
import com.factory.publiccom.service.impl.YouKuMemberFreeGoods;

public class YouKuMemberFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new YouKuMemberFreeGoods();
    }
}
