package com.decorator;

/**
 * 抽象的文件读写
 */
public interface DataLoader {
    String read();
    void write(String data);
}
