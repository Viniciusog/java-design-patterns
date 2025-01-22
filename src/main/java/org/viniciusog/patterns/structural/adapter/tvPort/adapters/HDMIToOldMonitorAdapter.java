package org.viniciusog.patterns.structural.adapter.tvPort.adapters;

import org.viniciusog.patterns.structural.adapter.tvPort.devices.OldMonitor;
import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.HDMI;

// class adapter
public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping VGA's OldMonitor's interface with a HDMI adapter.");
    }

    // is not necessary, oldMonitor has setImage implementation, but we want to show the converting message
    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String audio) {
        System.out.println("Sorry we don't work with sound.");
    }
}