package state;

import com.state.example.ConcreteStateA;
import com.state.example.ConcreteStateB;
import com.state.example.Context;
import com.state.example.State;
import com.state.example1.TrafficLight;
import com.template.AbstractClassTemplate;
import com.template.ConcreteClassA;
import com.template.ConcreteClassB;
import com.template.example02.Account;
import com.template.example02.LoanOneMonth;
import com.template.example02.LoanSevenDays;

public class Test {
    @org.junit.Test
    public void test(){
        Context context= new Context();
        State stateA =new ConcreteStateA();
        stateA.handle(context);
        System.out.println("==============================");
        State stateB =new ConcreteStateB();
        stateB.handle(context);
    }

    /**
     * 未使用 设计模式
     */
    @org.junit.Test
    public void test1(){
        TrafficLight trafficLight =new TrafficLight();
        trafficLight.switchToGreen();
        trafficLight.switchToRed();
        trafficLight.switchToYellow();
    }
    /**
     * 使用 状态设计模式
     */
    @org.junit.Test
    public void test2(){
        com.state.example2.TrafficLight trafficLight =new com.state.example2.TrafficLight();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
    }
}
