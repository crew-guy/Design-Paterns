package com.ankit.strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
            System.out.println("Compressing "+ fileName +" using PNG format");
    }
}
