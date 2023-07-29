package com.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

    //定义集合,存储所有观察者对象
    private ArrayList<ObServer> observers = new ArrayList<>();
    //注册方法,向观察者集合中增加一个观察者
    @Override
    public void attach(ObServer observer) {
        observers.add(observer);
    }

    //注销方法,用于从观察者集合中删除一个观察者
    @Override
    public void detach(ObServer observer) {
        observers.remove(observer);
    }

    //通知方法
    @Override
    public void notifyObServer() {
        //遍历观察者集合,调用每一个观察者的响应方法
        for (ObServer obs : observers) {
            obs.update();
        }
    }
}
