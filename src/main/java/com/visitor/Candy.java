package com.visitor;

import com.visitor.entity.Product;

import java.time.LocalDate;

/**
 * 糖果类
 **/
public class Candy extends Product implements Acceptable{
    public Candy(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。
        visitor.visit(this);
    }
}
