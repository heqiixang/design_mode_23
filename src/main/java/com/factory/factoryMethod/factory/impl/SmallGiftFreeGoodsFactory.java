package com.factory.factoryMethod.factory.impl;

import com.factory.factoryMethod.factory.FreeGoodsFactory;
import com.factory.publiccom.service.IFreeGoods;
import com.factory.publiccom.service.impl.SmallGiftFreeGoods;

public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
