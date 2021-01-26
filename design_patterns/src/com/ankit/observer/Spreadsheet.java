package com.ankit.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet was just updated with value :" + value);
    }
}