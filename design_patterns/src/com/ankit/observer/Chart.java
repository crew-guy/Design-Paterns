package com.ankit.observer;

import javax.xml.crypto.Data;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Chart was just updated with value :" + value);
    }
}
