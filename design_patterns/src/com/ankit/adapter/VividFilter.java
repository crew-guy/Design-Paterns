package com.ankit.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image){
        System.out.println("Applied custom made vivid filter");
    }
}
