package prototype;

import com.prototype.ConcretePrototype;
import com.prototype.Person;


public class Test {
    /**
     *
     * 测试浅克隆
     */
    @org.junit.Test
    public void test() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(concretePrototype==clone);
    }
    @org.junit.Test
    public void test01() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        Person person = new Person();
        person.setName("11111");
        concretePrototype.setPerson(person);
        ConcretePrototype concretePrototype1 = concretePrototype.clone();
        Person person1 = concretePrototype1.getPerson();
        person1.setName("2222");

        concretePrototype1.show();
        System.out.println(person==person1);

    }
}
