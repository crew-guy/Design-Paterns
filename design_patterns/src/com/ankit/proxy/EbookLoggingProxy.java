package com.ankit.proxy;

public class EbookLoggingProxy implements Ebook{
    private String fileName;
    private RealEbook ebook;

    public EbookLoggingProxy(String fileName){
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
        System.out.println("Logging : " + this.fileName);
    }
}
