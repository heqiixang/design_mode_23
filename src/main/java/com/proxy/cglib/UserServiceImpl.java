package com.proxy.cglib;

import java.util.Collections;
import java.util.List;

/**
 * @author spikeCong
 * @date 2022/9/23
 **/
public class UserServiceImpl {

    public List<User> findUserList(){

        return Collections.singletonList(new User("tom",18));
    }
}
