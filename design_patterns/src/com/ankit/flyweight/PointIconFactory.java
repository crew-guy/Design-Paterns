package com.ankit.flyweight;

import java.util.HashMap;

public class PointIconFactory {
    private HashMap<PointType, PointIcon> icons = new HashMap<>();
    private PointIcon pointIcon;

    public PointIcon getPointIcon(PointType type){
        if(!icons.containsKey(type)){
            var icon = new PointIcon(type, null);
            // usually the value of icon in PointIcon would have been a path to a website or a file system to get the image from
            icons.put(type,icon);
        }

        return icons.get(type);
    }
}
