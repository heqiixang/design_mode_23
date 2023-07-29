package flyweight;

import com.flyweight.ConcreteFlyweight;
import com.flyweight.Flyweight;
import com.flyweight.FlyweightFactory;
import com.flyweight.gobang.GobangFactory;
import com.flyweight.gobang.GobangFlyweight;

public class Test {
    @org.junit.Test
    public void test(){
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("D");
        Flyweight flyweight1 = flyweightFactory.getFlyweight("D");
        flyweight.operation("1外部属性");
        flyweight1.operation("2外部属性");
        System.out.println(flyweight==flyweight1);

        ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight("A");
        concreteFlyweight.operation("1");
        ConcreteFlyweight concreteFlyweight1 = new ConcreteFlyweight("A");
        concreteFlyweight1.operation("2");
        System.out.println(concreteFlyweight==concreteFlyweight1);

    }
    @org.junit.Test
    public void test1(){
        GobangFactory instance = GobangFactory.getInstance();
        GobangFlyweight gobangFlyweightA = instance.get("A");
        GobangFlyweight gobangFlyweightA1 = instance.get("A");
        gobangFlyweightA.display();
        gobangFlyweightA1.display();
        //判断白棋是否相等
        System.out.println(gobangFlyweightA==gobangFlyweightA1);
        GobangFlyweight gobangFlyweightB = instance.get("B");
        GobangFlyweight gobangFlyweightB1 = instance.get("B");
        gobangFlyweightB.display();
        gobangFlyweightB1.display();
        //判断黑棋是否相等
        System.out.println(gobangFlyweightB==gobangFlyweightB1);
    }
}
