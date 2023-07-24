package com.proxy.static_proxy;

/**
 * 静态代理
 *  优点，在不修改目标类的前提下，扩展目标类的功能
 *  缺点：冗余，由于代理对象要实现目标类的接口，会产生很多代理对象
 *      不易维护，一旦接口增加方法，目标对象和代理对象都要增加相应实现类 违反开闭原则
 */
public class UserProxy implements IUserDao{
    private IUserDao iUserDao;

    public UserProxy(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    @Override
    public void save() {
        System.out.println("开启日志");
        iUserDao.save();
        System.out.println("关闭日志");
    }
}
