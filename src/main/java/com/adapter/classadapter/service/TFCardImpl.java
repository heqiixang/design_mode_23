package com.adapter.classadapter.service;

import com.adapter.classadapter.TFCard;

public class TFCardImpl implements TFCard {


    @Override
    public String readTF() {
        String msg="读取TFCard";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println("tf卡写入"+msg);
    }
}
