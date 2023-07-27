package com.combination.demo;

import java.util.ArrayList;

/**
 * 文件夹
 */
public class Directory extends Entry{
    //文件名
    private String name;
    //文件夹和文件的集合
    private ArrayList<Entry> listDirectory=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 获取文大小
     * 1.如果entry对象是file类型，则调用getSize方法获取文件大小
     * 2.如果entry对象是Directory类型，会继续调用子文件夹的getSize()方法,形成递归调用
     * @return
     */
    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry :listDirectory) {
            size = size+entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry) {
        listDirectory.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        for (Entry entry :listDirectory) {
            entry.printList(prefix+"/"+name);
        }
    }
}
