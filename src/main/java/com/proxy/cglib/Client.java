package com.proxy.cglib;
import com.proxy.cglib.UserServiceImpl;
import java.util.List;

/**
 * @author spikeCong
 * @date 2022/9/23
 **/
public class Client {

    public static void main(String[] args) {

        //目标对象
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());

        //代理对象
        UserServiceImpl proxy = (UserServiceImpl) new UserLogProxy().getLogProxy(userService);
        System.out.println(proxy.getClass());

        List<User> userList = proxy.findUserList();
        System.out.println("用户信息: "+userList);
    }
}
