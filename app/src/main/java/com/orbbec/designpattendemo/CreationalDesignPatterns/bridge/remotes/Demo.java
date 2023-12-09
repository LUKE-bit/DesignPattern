package com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.remotes;

import com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.devices.Device;
import com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.devices.Radio;
import com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.devices.Tv;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        device.printStatus();
    }
}
