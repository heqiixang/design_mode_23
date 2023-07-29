package com.observer;

/**
 * 抽象目标类
 */
public interface Subject {
    void attach(ObServer obServer);
    void detach(ObServer obServer);
    void notifyObServer();
}
