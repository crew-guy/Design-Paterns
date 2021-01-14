package com.ankit;

public abstract class UIControl {
    public void enable(){
        System.out.println("Drawing enabled");
    }
    public abstract void draw();
}
