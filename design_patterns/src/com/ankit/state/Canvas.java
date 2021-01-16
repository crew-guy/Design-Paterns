package com.ankit.state;

public class Canvas {
//  USING THE STATE PATTERN
    public Tool currentTool;

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public Tool getCurrentTool(){
        return currentTool;
    }

    public void setCurrentTool(Tool requiredCurrentTool){
        this.currentTool = requiredCurrentTool;
    }

}
