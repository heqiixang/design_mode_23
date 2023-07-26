package com.adapter.classadapter;

public class Computer {
    public String read(SDCard sdCard){
        String readSD = sdCard.readSD();
        return readSD;
    }
}
