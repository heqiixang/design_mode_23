package com.template.example02;

/**
 * 借款七天
 **/
public class LoanSevenDays extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期7天,无利息!仅收取贷款金额1%的服务费!");
    }

    @Override
    public void display() {
        System.out.println("七日内借款无利息!");
    }

}
