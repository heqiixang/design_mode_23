package com.facade.smart;

public class SmartFacade {
    private TV tv;
    private Light light;

    public SmartFacade() {
        this.tv = new TV();
        this.light = new Light();
    }

    public void say(String message){
        if(message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else{
            System.out.println("没有这个指令");
        }
    }

    private void on() {
        tv.on();
        light.on();
    }

    private void off() {
        tv.off();
        light.off();
    }
}
