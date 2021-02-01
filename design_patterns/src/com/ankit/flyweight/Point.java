package com.ankit.flyweight;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
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
