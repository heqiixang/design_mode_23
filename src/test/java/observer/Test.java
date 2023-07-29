package observer;

import com.observer.ConcreteObServer;
import com.observer.ConcreteObServer1;
import com.observer.ConcreteSubject;
import com.observer.example1.LotteryServiceImpl;

public class Test {
    @org.junit.Test
    public void test(){
        //创建目标类(被观察者)
        ConcreteSubject subject = new ConcreteSubject();
        //注册观察者类,可以注册多个
        subject.attach(new ConcreteObServer());
        subject.attach(new ConcreteObServer1());
        //具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
        subject.notifyObServer();
    }

    /**
     * 未使用观察者模式
     */
    @org.junit.Test
    public void test1(){
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        lotteryService.lottery("12345678970");
    }
    /**
     * 观察者模式
     */
    @org.junit.Test
    public void test2(){
        com.observer.example2.LotteryService lotteryService = new com.observer.example2.LotteryServiceImpl();
        lotteryService.lotteryAndMsg("123741");
    }
}
