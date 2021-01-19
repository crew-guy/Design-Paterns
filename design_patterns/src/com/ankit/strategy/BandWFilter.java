package com.ankit.strategy;

public class BandWFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering " + fileName + " using the Black and White filter");
    }
}
