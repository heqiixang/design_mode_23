package com.mediator.example;

/**
 * 抽象组件类
 **/
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void exec(String key);
}
