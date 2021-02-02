package com.ankit.bridge;

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number){
        device.setDeviceChannel(number);
    }
}
