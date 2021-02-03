package com.ankit.proxy;

public class RealEbook implements Ebook{
    String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load(){
        System.out.println("Loading ebook : " + this.fileName);
    }

    @Override
    public String getFilename() {
        return this.fileName;
    }

    @Override
    public void show() {
        System.out.println("Showing ebook : " + this.fileName);
    }
}
