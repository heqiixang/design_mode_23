package com.combination.demo;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public abstract Entry add(Entry entry);

    //显示指定目录下所有文件信息
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
