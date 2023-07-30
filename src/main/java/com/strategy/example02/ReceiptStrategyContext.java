package com.strategy.example02;


import com.strategy.example01.Receipt;

/**
 * 上下文类,持有策略接口
 **/
public class ReceiptStrategyContext {

    private ReceiptHandleStrategy receiptHandleStrategy;

    public void setReceiptHandleStrategy(ReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    //调用策略类中的方法
    public void handleReceipt(Receipt receipt){
        if(receipt != null){
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}
