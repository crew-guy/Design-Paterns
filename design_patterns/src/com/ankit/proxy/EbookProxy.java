package com.ankit.proxy;

public class EbookProxy implements Ebook{
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFilename() {
        return this.fileName;
    }

    @Override
    public void show() {
        if(this.ebook == null){
            this.ebook = new RealEbook(this.fileName);
        }
        ebook.show();
    }
}
