package com.flyweight.gobang;

public abstract class GobangFlyweight {
    public abstract String getColor();
    public void display(){
        System.out.println("棋子颜色"+getColor());
    }
}
