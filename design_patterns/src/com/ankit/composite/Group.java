package com.ankit.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component
{
    private List<Component> components = new ArrayList<>();

    public void add(Component cmp){
        components.add(cmp);
    }

    @Override
    public void render() {
        for(var cmp : components){
            cmp.render();
        }
    }

    @Override
    public void move() {
        for(var cmp : components){
            cmp.move();
        }
    }
}
