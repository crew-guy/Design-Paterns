package com.ankit.abusingStatePattern;

public class Stopwatch {
    // Ideal, simple solution
//    public boolean isRunning;
//
//    public void clickWithoutStatePattern(){
//        if(isRunning){
//            isRunning = false;
//            System.out.println("Stopwatch has started !");
//        }else{
//            isRunning = true;
//            System.out.println("Stopwatch has stopped !");
//        }
//    }
    // Shoehorning a design pattern
    public State currentState = new StoppedState(this);

    public State getCurrentState() {
        return currentState;
    }

    public void click(){
        currentState.click();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}


