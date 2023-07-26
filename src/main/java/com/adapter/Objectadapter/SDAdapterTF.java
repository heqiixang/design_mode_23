package com.adapter.Objectadapter;

import com.adapter.classadapter.SDCard;
import com.adapter.classadapter.TFCard;

public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器读取SDCard 和 TFCard");
        return tfCard.readTF();
    }

    @Override
    public void write(String msg) {

    }
}
