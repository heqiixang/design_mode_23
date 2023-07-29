package com.observer;

public class ConcreteObServer1 implements ObServer{
    @Override
    public void update() {
        System.out.println("ConcreteObServer1 得到通知");
    }
}
