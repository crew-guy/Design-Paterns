package com.ankit.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+ fileName +" using JPEG format");
    }
}
