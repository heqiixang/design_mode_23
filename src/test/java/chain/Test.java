package chain;

import com.alibaba.fastjson.JSON;
import com.chain.example01.*;
import com.chain.example02.AuthController;
import com.chain.example02.AuthInfo;
import com.chain.example02.AuthService;
import com.chain.example03.AuthLink;
import com.chain.example03.Level1AuthLink;
import com.chain.example03.Level2AuthLink;
import com.chain.example03.Level3AuthLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    @org.junit.Test
    public void test(){
        Handler h1 = new HandlerA();
        Handler h2 = new HandlerB();
        Handler h3 = new HandlerC();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        RequestData requestData = new RequestData("请求数据ABCDE");
        h1.handle(requestData);
    }

    /**
     * 未使用责任链模式
     */
    @org.junit.Test
    public void test1() throws ParseException {
        AuthController controller = new AuthController();

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化
        Date authDate = f.parse("2022-11-12 00:00:00");

        //设置申请审核时间
        AuthInfo info1 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info1.getInfo() + "--> 三级负责人郭组长已审批");
        AuthService.auth("1000013","1001198819771966");

        AuthInfo info2 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info2.getInfo() + "--> 二级负责人王经理已审批");
        AuthService.auth("1000012","1001198819771966");

        AuthInfo info3 = controller.doAuth("研发小周", "1001198819771966", authDate);
        System.out.println(info3.getInfo() + "--> 一级负责人罗总已审批");
        AuthService.auth("1000011","1001198819771966");

        System.out.println("\n审批完成!");
    }

    private final Logger logger = LoggerFactory.getLogger(Test.class);

    /**
     * 责任链模式
     * @throws ParseException
     */
    @org.junit.Test
    public void test_AuthLink() throws ParseException {

        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2022-11-18 23:49:46");

        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.info("测试结果：{}", "模拟三级负责人审批，王工");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.info("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.info("测试结果：{}", "模拟一级负责人审批，段总");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

    }
}
