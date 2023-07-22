package com.singleton;

/**
 * 静态内部类单例
 * 静态内部类只会在被调用的时候才会创建 懒加载
 * 由jvm进进行唯一一次的初始化 所以线程安全
 */
public class SingletonStaticClass {
    //如果不想反射破坏单例 在构造方法中加异常
    private SingletonStaticClass() throws Exception {
        if(SingletonStatic.singletonStaticClass!=null){
            throw  new RuntimeException("不许反射创建对象");
        }
    }

    public static class SingletonStatic{
        private static SingletonStaticClass singletonStaticClass;

        static {
            try {
                singletonStaticClass = new  SingletonStaticClass();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static SingletonStaticClass getInstance(){
        return SingletonStatic.singletonStaticClass;
    }
}
