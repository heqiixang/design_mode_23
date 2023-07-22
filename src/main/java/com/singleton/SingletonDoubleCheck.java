package com.singleton;

public class SingletonDoubleCheck {
    private SingletonDoubleCheck(){}
    //使用volatile 保证可见性（当前线程修改后，其他线程可以拿到修改后的值） 禁止指令重排
    private static volatile SingletonDoubleCheck doubleCheckSingleton;
    public static SingletonDoubleCheck getInstance(){
        //第一次判断如果不为null 直接返回 是null 加锁进入下面逻辑
        if(doubleCheckSingleton==null){
            synchronized (SingletonDoubleCheck.class){
                //第二次抢到锁判断是否为null 不是直接返回 是创建对象
                if(doubleCheckSingleton ==null){
                    /**
                     * 创建对象在jvm 中分为3步
                     * 1.分配内存空间
                     * 2.初始化对象
                     * 3.将对象指向分配的空间
                     * 这样可能导致指令重排
                     * 最后的顺序 就变成132 这是对象就不为空  但是内存空间没有对象
                     * 此时又进来一个线程在第一次判断发现对象不是null 返回 但是这个对象不是一个完整的对象 导致报错
                     */
                    doubleCheckSingleton=new SingletonDoubleCheck();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
