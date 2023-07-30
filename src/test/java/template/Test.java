package template;

import com.template.AbstractClassTemplate;
import com.template.ConcreteClassA;
import com.template.ConcreteClassB;
import com.template.example02.Account;
import com.template.example02.LoanOneMonth;
import com.template.example02.LoanSevenDays;

public class Test {
    @org.junit.Test
    public void test(){
        AbstractClassTemplate concreteClassA = new ConcreteClassA();
        concreteClassA.run("");

        System.out.println("===========");

        AbstractClassTemplate concreteClassB = new ConcreteClassB();
        concreteClassB.run("x");
    }
    @org.junit.Test
    public void test1(){
        Account loanOneMonth=new LoanOneMonth();
        loanOneMonth.handle("tom","123456");
        Account loanSevenDays = new LoanSevenDays();
        loanSevenDays.handle("tom","123456");
    }
}
