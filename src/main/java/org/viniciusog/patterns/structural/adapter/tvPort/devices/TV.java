package org.viniciusog.patterns.structural.adapter.tvPort.devices;

import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println(">> This is your image: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">> This is your sound: " + sound);
    }
}
