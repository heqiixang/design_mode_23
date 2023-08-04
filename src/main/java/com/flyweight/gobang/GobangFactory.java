package com.flyweight.gobang;

import java.util.HashMap;
import java.util.Map;

public class GobangFactory {

    private static Map<String,GobangFlyweight> pool= new HashMap();
    private GobangFactory(){
        pool.put("A",new WhiteGobang());
        pool.put("B",new BlackGobang());
    }

    /**
     * 单例静态内部类
     */
    private static class SingletonHoled{
        private static final GobangFactory INSTANCE = new GobangFactory();
    }

    /**
     * 获取单例对象的方法
     * @return
     */
    public static final GobangFactory getInstance(){
        return SingletonHoled.INSTANCE;
    }

    /**
     * 获取享元对象
     * @param key
     * @return
     */
    public GobangFlyweight get(String key){
        return pool.get(key);
    }
}
