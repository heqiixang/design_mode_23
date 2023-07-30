package com.strategy.example02;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class ReceiptHandleStrategyFactory {

    public ReceiptHandleStrategyFactory() {
    }

    //使用Map集合存储策略信息,彻底消除if...else
    private static Map<String,ReceiptHandleStrategy> strategyMap;

    //初始化具体策略,保存到map集合
    public static void init(){
        strategyMap = new HashMap<>();
        //可以通过配置文件解析 可以不用修改代码
        /*try {
            SAXReader reader = new SAXReader();
            String file = "D:\JavaUtil\WorkSpace\design_mode_23\src\main\resources\config.xml";
            Document document = reader.read(file);
            Node node = document.selectSingleNode("/config/className");
            String className = node.getText();
            Class clazz = Class.forName(className);
            ReceiptHandleStrategy instance = (ReceiptHandleStrategy)clazz.newInstance();
            strategyMap.put("MT1011",instance);

            Node node2 = document.selectSingleNode("/config/className[2]");
            String className2 = node.getText();
            Class clazz2 = Class.forName(className2);
            ReceiptHandleStrategy instance2 = (ReceiptHandleStrategy)clazz.newInstance();
            strategyMap.put("MT2101",instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

       strategyMap.put("MT1011",new Mt1011ReceiptHandleStrategy());
       strategyMap.put("MT2101",new Mt2101ReceiptHandleStrategy());
    }

    //根据回执类型获取对应策略类对象
    public static ReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
        return strategyMap.get(receiptType);
    }
}
