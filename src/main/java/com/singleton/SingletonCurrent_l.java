package com.singleton;

/**
 * 懒汉 线程安全
 * 使用synchronized 锁 锁住单例对象的创建方法
 * 缺点 并发度很低 相当串行操作
 */
public class SingletonCurrent_l {
    private SingletonCurrent_l(){

    }
    private static SingletonCurrent_l singletonCurrentL ;

    public static synchronized SingletonCurrent_l getInstance(){
        //synchronized 不能加在方法里面 会导致空指针异常
        //synchronized (singletonCurrentL){
            if(singletonCurrentL==null){
                singletonCurrentL = new SingletonCurrent_l();
            }
            return singletonCurrentL;
        //}
    }
}
