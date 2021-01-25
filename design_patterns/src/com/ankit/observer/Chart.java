package com.ankit.observer;

public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("Chart was just updated !");
    }
}
