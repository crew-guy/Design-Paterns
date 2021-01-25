package com.ankit.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update() {
        System.out.println("Spreadsheet was just updated !");
    }
}
