package com.ankit.decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream){
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Storing "+data.substring(0,5));
    }
}
