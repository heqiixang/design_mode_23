package com.chain.example03;

import com.alibaba.fastjson.JSON;
import com.chain.example02.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/14
 **/
public class Client {

    private Logger logger = LoggerFactory.getLogger(Client.class);

    public void test()throws ParseException {

        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2022-11-11 23:49:46");

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
