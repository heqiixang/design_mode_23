package com.builder.director;


import com.builder.builder.Builder;
import com.builder.entity.Bike;


public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
