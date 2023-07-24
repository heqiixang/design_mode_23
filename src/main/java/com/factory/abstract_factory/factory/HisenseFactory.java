package com.factory.abstract_factory.factory;


import com.factory.abstract_factory.procude.AbstractFreezer;
import com.factory.abstract_factory.procude.AbstractTV;
import com.factory.abstract_factory.procude.HisenseFreezer;
import com.factory.abstract_factory.procude.HisenseTV;

public class HisenseFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
