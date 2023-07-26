package facade;

import com.facade.Facade;
import com.facade.smart.SmartFacade;

public class Test {
    @org.junit.Test
    public void test(){
        Facade facade =new Facade();
        facade.method();
    }
    @org.junit.Test
    public void test1(){
        SmartFacade smartFacade =new SmartFacade();
        smartFacade.say("打开");
        smartFacade.say("关闭");
    }
}
