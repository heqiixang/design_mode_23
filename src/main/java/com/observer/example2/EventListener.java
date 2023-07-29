package com.observer.example2;


import com.observer.example1.LotteryResult;

/**
 * 事件监听接口
 * @author spikeCong
 * @date 2022/10/11
 **/
public interface EventListener {

    void doEvent(LotteryResult result);
}
