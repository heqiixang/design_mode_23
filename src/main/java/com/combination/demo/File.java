package com.combination.demo;

public class File extends Entry{
    private String fileName;
    private int fileSize;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }





    @Override
    public String getName() {
        return this.fileName;
    }

    @Override
    public int getSize() {
        return this.fileSize;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
    }
}
