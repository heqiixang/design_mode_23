package com.visitor;

import com.visitor.entity.Product;

import java.time.LocalDate;

/**
 * 酒水类
 * @author spikeCong
 * @date 2022/10/18
 **/
public class Wine extends Product implements Acceptable{

    public Wine(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
