package com.observer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 抽象的观察者接口
 * 为不同观察者的更新(响应)行为定义相同的接口,不同的观察者对该方法有不同的实现
 */
public interface ObServer {
    public void update();
}
