package com.decorator;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 具体实现类
 */
public class BataFileDataLoader implements DataLoader{
    private String filePath;

    public BataFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        try {
            String s = FileUtils.readFileToString(new File(filePath), "utf-8");
            return s;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath),data,"utf-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
