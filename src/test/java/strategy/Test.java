package strategy;

import com.strategy.ConcreteStrategyA;
import com.strategy.ConcreteStrategyB;
import com.strategy.Strategy;
import com.strategy.example01.Receipt;
import com.strategy.example01.ReceiptBuilder;
import com.strategy.example02.ReceiptHandleStrategy;
import com.strategy.example02.ReceiptHandleStrategyFactory;
import com.strategy.example02.ReceiptStrategyContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        Strategy strategyA =new ConcreteStrategyA();
        strategyA.algorithm();
        Strategy strategyB =new ConcreteStrategyB();
        strategyB.algorithm();
    }

    /**
     * 没使用策略模式
     */
    @org.junit.Test
    public void test1(){
        List<Receipt> receiptList = ReceiptBuilder.genReceiptList();

        //循环判断
        for (Receipt receipt : receiptList) {
            if ("MT1011".equals(receipt.getType())) {
                System.out.println("接收到MT1011回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑A" + "\n");
            } else if ("MT2101".equals(receipt.getType())) {
                System.out.println("接收到MT2101回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑B" + "\n");
            } else if ("MT4101".equals(receipt.getType())) {
                System.out.println("接收到MT4101回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑C" + "\n");
            } else if ("MT8104".equals(receipt.getType())) {
                System.out.println("接收到MT8104回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑D");
            }
        }
    }

    /**
     *策略模式
     */
    @org.junit.Test
    public void test2(){
        //模拟数据
        List<Receipt> receiptList = ReceiptBuilder.genReceiptList();

        //策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();

        //策略模式将策略的 定义、创建、使用这三部分进行了解耦
        for (Receipt receipt : receiptList) {
            //获取置策略
            ReceiptHandleStrategyFactory.init();
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            //设置策略
            context.setReceiptHandleStrategy(strategy);
            //执行策略
            context.handleReceipt(receipt);
        }
    }
}
