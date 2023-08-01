package visitor;

import com.template.AbstractClassTemplate;
import com.template.ConcreteClassA;
import com.template.ConcreteClassB;
import com.template.example02.Account;
import com.template.example02.LoanOneMonth;
import com.template.example02.LoanSevenDays;
import com.visitor.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        //模拟添加多个商品的操作
        List<Acceptable> products = Arrays.asList(
                new Candy("金丝猴奶糖", LocalDate.of(2022,6,10),10.00),
                new Wine("衡水老白干",LocalDate.of(2020,6,10),100.00),
                new Fruit("草莓",LocalDate.of(2022,10,12),50.00,1)
        );

        Visitor visitor = new DiscountVisitor(LocalDate.of(2022,10,17));
        for (Acceptable product : products) {
            product.accept(visitor);
        }
    }
}
