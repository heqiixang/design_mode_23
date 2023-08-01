package com.memento.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento 表示状态
 **/
public class Memento {

    int money;    //所持金钱
    ArrayList fruits; //获得的水果

    //构造函数
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    //获取当前玩家所有的金钱
    public int getMoney() {
        return money;
    }

    //获取当前玩家所有的水果
    List getFruits() {
        return (List)fruits.clone();
    }

    //添加水果
    void addFruit(String fruit){
        fruits.add(fruit);
    }
}
