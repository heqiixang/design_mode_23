package com.adapter.classadapter.service;

import com.adapter.classadapter.SDCard;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("适配器读取SDCard 和 TFCard");
        return readTF();
    }

    @Override
    public void write(String msg) {
        System.out.println("tf适配器写入"+msg);
    }
}
