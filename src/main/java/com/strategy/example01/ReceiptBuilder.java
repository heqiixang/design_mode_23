package com.strategy.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class ReceiptBuilder {

    public static List<Receipt> genReceiptList(){
        //模拟回执信息
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("MT1101回执","MT1011"));
        receiptList.add(new Receipt("MT2101回执","MT2101"));
//        receiptList.add(new Receipt("MT4101回执","MT4101"));
//        receiptList.add(new Receipt("MT8104回执","MT8104"));

        //......
        return receiptList;
    }

}
