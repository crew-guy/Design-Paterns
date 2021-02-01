package com.ankit.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon picon;

    public Point(int x, int y, PointIcon picon) {
        this.x = x;
        this.y = y;
        this.picon = picon;
    }
    public void draw(){
        System.out.printf("%s at (%d,%d)\n",picon.getType(),x,y);
    }
}
