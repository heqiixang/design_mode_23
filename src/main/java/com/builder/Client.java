package com.builder;


import com.builder.builder.Builder;
import com.builder.builder.HelloBuilder;
import com.builder.builder.MobikeBuilder;
import com.builder.director.Director;
import com.builder.entity.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public class Client {

    public static void main(String[] args) {
        showBike(new HelloBuilder());
        showBike(new MobikeBuilder());
    }


    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
