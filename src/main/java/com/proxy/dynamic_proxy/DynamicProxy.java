package com.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                //目标类的加载器
                target.getClass().getClassLoader(),
                //目标类实现的接口
                target.getClass().getInterfaces(),
                //事件处理
                new InvocationHandler() {
                    /**
                     * @param proxy 代理对象
                     * @param method 对应代理对象要调用的方法
                     * @param args 对应代理对象调用方法时传的实际对象
                     *             返回目标对象方法的返回值 没有返回null
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        method.invoke(target,args);
                        System.out.println("关闭事务");
                        return null;
                    }
                });
    }
}
