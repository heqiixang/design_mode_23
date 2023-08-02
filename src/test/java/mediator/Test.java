package mediator;

import com.mediator.example.Colleague;
import com.mediator.example.ConcreteColleagueA;
import com.mediator.example.ConcreteColleagueB;
import com.mediator.example.MediatorImpl;
import com.mediator.example1.HouseOwner;
import com.mediator.example1.MediatorStructure;
import com.mediator.example1.Tenant;

public class Test {

    @org.junit.Test
    public void test(){
        //创建中介者
        MediatorImpl mediator = new MediatorImpl();

        //创建同事对象
        Colleague c1 = new ConcreteColleagueA(mediator);
        c1.exec("key-A");
        Colleague c2 = new ConcreteColleagueB(mediator);
        c2.exec("key-B");
    }
    @org.junit.Test
    public void test1(){
        //一个房主 一个租房者 一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("路飞", mediator);
        Tenant tenant = new Tenant("娜美", mediator);

        //中介收集房租和租房者信息
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("需要一个两室一厅的房子,一家人住");
        houseOwner.contact("出租一套两室一厅带电梯,月租5000");
    }
}
