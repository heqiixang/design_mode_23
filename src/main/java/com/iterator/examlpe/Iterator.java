package com.iterator.examlpe;

/**
 * 迭代器接口
 * @author spikeCong
 * @date 2022/10/18
 **/
public interface Iterator<E> {

    //判断集合中是否有下一个元素
    boolean hasNext();

    //将游标后移一位元素
    void next();

    //返回当前游标指定的元素
    E currentItem();
}
