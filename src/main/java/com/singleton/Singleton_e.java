package com.singleton;

/**
 * 1.私有化构造方法
 * 2.定义静态成员变量 在类加载的时候创建对象
 * 3.公共的方法用于外部调用创建单列对象
 * 饿汉模式在类加载时会创建对象所以是线程安全的 不支持延时加载 获取实例对象速度快 对象比较大并且一直没使用会造成内存浪费
 */
public class Singleton_e {

    private Singleton_e() {

    }

    private static Singleton_e singletonE = new Singleton_e();

    public static Singleton_e getInstance() {
        return singletonE;
    }
}
