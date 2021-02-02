package com.ankit.bridge;

public class SamsungTV implements Device{
    @Override
    public void deviceTurnOn() {
        System.out.println("Samsung : Turn On");
    }

    @Override
    public void deviceTurnOff() {
        System.out.println("Samsung : Turn Off");
    }

    @Override
    public void setDeviceChannel(int number) {
        System.out.println("Samsung set channel : " + number);
    }
}
