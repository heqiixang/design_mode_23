package com.observer;

public class ConcreteObServer implements ObServer{
    @Override
    public void update() {
        System.out.println("ConcreteObServer 得到通知");
    }
}
