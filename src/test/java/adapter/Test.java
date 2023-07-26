package adapter;

import com.adapter.classadapter.Computer;
import com.adapter.classadapter.SDCard;
import com.adapter.classadapter.TFCard;
import com.adapter.classadapter.service.SDAdapterTF;
import com.adapter.classadapter.service.SDCardImpl;
import com.adapter.classadapter.service.TFCardImpl;

public class Test {
    @org.junit.Test
    public void test(){
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));
        System.out.println("===========================");
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.read(sdAdapterTF));
    }
    @org.junit.Test
    public void test1(){
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));
        System.out.println("=============================");

        TFCardImpl tfCard = new TFCardImpl();
        com.adapter.Objectadapter.SDAdapterTF sdAdapterTF = new com.adapter.Objectadapter.SDAdapterTF(tfCard);
        System.out.println(computer.read(sdAdapterTF));
    }
}
