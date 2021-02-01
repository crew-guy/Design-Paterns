package com.ankit.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;
    private List<Point> points = new ArrayList<>();

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public void addPointOnMap(int x, int y,PointType type, byte[] icon){
        var picon = new PointIcon(type,null);
        var point = new Point(x,y,picon);
        points.add(point);
    }

    public void drawMap(){
        for(var point:points){
            point.draw();
        }
    }
}
