package com.ankit.composite;

public class Shape implements Component{
    @Override
    public void render(){
        System.out.println("Rendered !");
    }

    @Override
    public void move(){
        System.out.println("Moved !");
    }
}
