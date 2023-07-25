package decorator;

import com.decorator.BataFileDataLoader;
import com.decorator.DataLoader;
import com.decorator.EncryptionDataDecorator;

public class Test {
    @org.junit.Test
    public void test(){
        String info = "name:张三，age:14";
        DataLoader dataLoader = new BataFileDataLoader("demo.text");
        dataLoader.write(info);
        String read = dataLoader.read();
        System.out.println(read);
    }
    @org.junit.Test
    public void test1(){
        String info = "name:张三，age:14";
        DataLoader dataLoader = new EncryptionDataDecorator(new BataFileDataLoader("demo1.text"));
        dataLoader.write(info);
        String read = dataLoader.read();
        System.out.println(read);
    }
}
