package org.viniciusog.patterns.structural.adapter.tvPort.devices;

import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println(">> This is your image: " + image);
    }
}