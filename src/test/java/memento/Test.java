package memento;

import com.memento.example.Caretaker;
import com.memento.example.Originator;
import com.memento.example1.Memento;
import com.memento.example1.Player;

public class Test {
    @org.junit.Test
    public void test(){
        //创建发起人对象
        Originator originator = new Originator();
        originator.setId("1");
        originator.setName("spike");
        originator.setPhone("13512341234");
        System.out.println("=============" + originator);

        //创建负责人对象,并保存备忘录对象
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.create());

        //修改
        originator.setName("update");
        System.out.println("=============" + originator);

        //从负责人对象中获取备忘录对象,实现撤销
        originator.restore(caretaker.getMemento());
        System.out.println("=============" + originator);
    }
    @org.junit.Test
    public void test1(){
        Player player = new Player(100);        //最初所持的金钱数
        Memento memento = player.createMemento();       //保存最初状态

        for (int i = 0; i < 100; i++) {
            //显示扔骰子的次数
            System.out.println("=====" + i);

            //显示当前状态
            System.out.println("当前状态: " + player);

            //开启游戏
            player.yacht();
            System.out.println("所持有的金钱为: " + player.getMoney() + " 元");

            //决定如何操作Memento
            if(player.getMoney() > memento.getMoney()){
                System.out.println("赚到金币,保存当前状态,继续游戏!");
                memento = player.createMemento();
            }else if(player.getMoney() < memento.getMoney() / 2){
                System.out.println("所持金币不多了,将游戏恢复到初始状态!");
                player.restore(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("");
        }
    }
}
