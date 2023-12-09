package com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.remotes;

import com.orbbec.designpattendemo.CreationalDesignPatterns.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
