package com.ankit.bridge;

public class SonyTV implements Device{
    @Override
    public void deviceTurnOn() {
        System.out.println("Sony : Turn On");
    }

    @Override
    public void deviceTurnOff() {
        System.out.println("Sony : Turn Off");
    }

    @Override
    public void setDeviceChannel(int number) {
        System.out.println("Sony set channel : " + number);
    }
}
