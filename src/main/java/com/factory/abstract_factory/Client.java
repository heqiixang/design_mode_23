package com.factory.abstract_factory;


import com.factory.abstract_factory.factory.AppliancesFactory;
import com.factory.abstract_factory.factory.HisenseFactory;
import com.factory.abstract_factory.procude.AbstractFreezer;
import com.factory.abstract_factory.procude.AbstractTV;

/**
 * 客户端: 抽象工厂模式隔离了具体类的生成,使得客户端不需要知道什么被创建.
 * 由于这种隔离,使得更换一个具体工厂变得相对容易,所有具体工厂都实现了抽象
 * 工厂中定义的公共接口,因此只需要改变具体工厂的实例,就可以在某种程度上改变
 * 整个软件系统的行为.
 *
 **/
public class Client {

    private AbstractTV tv;

    private AbstractFreezer freezer;

    public Client(AppliancesFactory factory) {

        //通过抽象工厂来生产家电
        this.tv = factory.createTV();
        this.freezer = factory.createFreezer();
    }

    public AbstractTV getTv() {
        return tv;
    }

    public void setTv(AbstractTV tv) {
        this.tv = tv;
    }

    public AbstractFreezer getFreezer() {
        return freezer;
    }

    public void setFreezer(AbstractFreezer freezer) {
        this.freezer = freezer;
    }

    public static void main(String[] args) {

        Client client = new Client(new HisenseFactory());
        AbstractTV tv = client.getTv();
        System.out.println(tv);
        AbstractFreezer freezer = client.getFreezer();
        System.out.println(freezer);
    }
}
