package com.ankit.strategy;

public class RGBFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering " + fileName + "  using the RGB filter");
    }
}
