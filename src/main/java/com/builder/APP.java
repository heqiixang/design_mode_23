package com.builder;

public class APP {
    public static void main(String[] args) {
        RabbitMQClient rabbitMQClient = new RabbitMQClient.Builder().setConnectionTimeout(500).setExchange("exchange-1").setQueue("queue-1").build();
    }
}
