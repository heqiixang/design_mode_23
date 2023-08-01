package com.visitor;

import com.visitor.entity.Product;

import java.time.LocalDate;

/**
 * 水果类
 * @author spikeCong
 * @date 2022/10/18
 **/
public class Fruit extends Product implements Acceptable{

        //重量
        private float weight;

        public Fruit(String name, LocalDate producedDate, double price, float weight) {
            super(name, producedDate, price);
            this.weight = weight;
        }

        public float getWeight() {
            return weight;
        }

            public void setWeight(float weight) {
                this.weight = weight;
            }

    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。
        visitor.visit(this);
    }
}
