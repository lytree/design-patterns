package com.design.bridge;

import com.design.bridge.devices.Device;
import com.design.bridge.devices.impl.Radio;
import com.design.bridge.devices.impl.Tv;
import com.design.bridge.remotes.impl.AdvancedRemote;
import com.design.bridge.remotes.impl.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
