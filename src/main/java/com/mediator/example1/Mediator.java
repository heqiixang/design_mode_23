package com.mediator.example1;

/**
 * 抽象中介者
 * @author spikeCong
 * @date 2022/10/20
 **/
public abstract class Mediator {

    //申明一个联络方法
    public abstract void contact(String message,Person person);
}
