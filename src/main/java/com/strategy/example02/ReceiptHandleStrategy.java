package com.strategy.example02;


import com.strategy.example01.Receipt;

/**
 * 回执处理策略接口
 **/
public interface ReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);
}
