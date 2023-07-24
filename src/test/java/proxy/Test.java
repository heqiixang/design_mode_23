package proxy;

import com.proxy.dynamic_proxy.DynamicProxy;
import com.proxy.static_proxy.IUserDao;
import com.proxy.static_proxy.UserProxy;
import com.proxy.static_proxy.UserServiceImpl;

public class Test {
    @org.junit.Test
    public void test(){
        IUserDao dao =new UserServiceImpl();
        UserProxy userProxy = new UserProxy(dao);
        userProxy.save();
    }
    @org.junit.Test
    public void test01(){
        IUserDao dao =new UserServiceImpl();
        IUserDao dynamicProxy = (IUserDao)new DynamicProxy(dao).getProxyInstance();
        dynamicProxy.save();
    }
}
