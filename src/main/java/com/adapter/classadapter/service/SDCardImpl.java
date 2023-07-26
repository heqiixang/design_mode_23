package com.adapter.classadapter.service;

import com.adapter.classadapter.SDCard;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "读取SDCard";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println("sd卡写入"+msg);
    }
}
