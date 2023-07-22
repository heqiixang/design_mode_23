package singleton;

import com.singleton.*;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestSingleton {
    @Test
    public void test(){
        Singleton_e instance = Singleton_e.getInstance();
        Singleton_e instance1 = Singleton_e.getInstance();
        System.out.println(instance==instance1);
    }
    //验证多线程懒汉模式
    @Test
    public void testSingleton_l(){
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                Singleton_l singletonL = Singleton_l.getInstance();
                System.out.println(Thread.currentThread().getName()+"------------"+singletonL);

            }).start();
        }

    }
    @Test
    public void testSingletonCurrent_l(){
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                SingletonCurrent_l singletonCurrent_l = SingletonCurrent_l.getInstance();
                System.out.println(Thread.currentThread().getName()+"------------"+singletonCurrent_l);

            }).start();
        }

    }
    @Test
    public void testDoubleCheckSingleton(){
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
                System.out.println(Thread.currentThread().getName()+"------------"+instance);
            }).start();
        }
    }
    @Test
    public void testSingletonStaticClass(){
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                SingletonStaticClass instance = SingletonStaticClass.getInstance();
                System.out.println(Thread.currentThread().getName()+"------------"+instance);
            }).start();
        }
    }

    /**
     * 反射破坏单例
     * @param args
     */
    /*public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonStaticClass> singletonStaticClassClass = SingletonStaticClass.class;

        //获取类的构造方法
        Constructor<SingletonStaticClass> declaredConstructor = singletonStaticClassClass.getDeclaredConstructor();
        //设置私有成员可以操作
        declaredConstructor.setAccessible(true);
        SingletonStaticClass singletonStaticClass1 = declaredConstructor.newInstance();
        SingletonStaticClass singletonStaticClass2 = declaredConstructor.newInstance();
        System.out.println(singletonStaticClass1 == singletonStaticClass2);
    }*/

    /**
     * 反射能否破坏 枚举类的单列
     * @param args
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws Exception{
        Class<SingletonEnum> singletonEnum = SingletonEnum.class;

        //获取类的空参构造方法
        Constructor<SingletonEnum> declaredConstructor = singletonEnum.getDeclaredConstructor();
        //设置私有成员可以操作
        declaredConstructor.setAccessible(true);
        SingletonEnum singletonEnum1 = declaredConstructor.newInstance();
        //报错原因 在newInstance方法中 会判断 是否是enum类 是 不能通过反射创建对象
        SingletonEnum instance = declaredConstructor.newInstance(String.class, int.class);
        System.out.println(instance);


    }
}
