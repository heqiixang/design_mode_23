package com.singleton;

public enum SingletonEnum {
    SINGLETON_ENUM;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public SingletonEnum getInstance(){
        return SINGLETON_ENUM;
    }
}
