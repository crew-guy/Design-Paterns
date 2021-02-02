package com.ankit.bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl (Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.deviceTurnOn();
    }

    public void turnOff(){
        device.deviceTurnOff();
    }
}
