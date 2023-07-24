package com.factory.abstract_factory.factory;

import com.factory.abstract_factory.procude.AbstractFreezer;
import com.factory.abstract_factory.procude.AbstractTV;
import com.factory.abstract_factory.procude.HairFreezer;
import com.factory.abstract_factory.procude.HairTV;

/**
 * 具体工厂
 **/
public class HairFactory implements AppliancesFactory {


    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}
