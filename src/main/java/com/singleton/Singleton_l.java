package com.singleton;

/**
 * 1.私有化构造方法
 * 2.c
 * 支持懒加载 只有调用getInstance 才会创建对象
 */
public class Singleton_l {
    private Singleton_l() {

    }

    private static Singleton_l singletonL;

    public static Singleton_l getInstance() {
        if (singletonL == null) {
            singletonL = new Singleton_l();
        }
        return singletonL;
    }

}
