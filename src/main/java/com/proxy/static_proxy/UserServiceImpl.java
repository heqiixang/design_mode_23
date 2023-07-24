package com.proxy.static_proxy;

public class UserServiceImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存对象");
    }
}
