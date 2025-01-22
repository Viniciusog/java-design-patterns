package org.viniciusog.patterns.structural.adapter.tvPort.adapters;

import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.HDMI;
import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.VGA;

// object adapter
public class HDMIToVGAAdapter implements HDMI {

    private VGA vgaDevice;

    public HDMIToVGAAdapter(VGA vgaDevice) {
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vgaDevice = vgaDevice;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vgaDevice.setImage(image);
    }

    @Override
    public void setSound(String audio) {
        System.out.println("Sorry, we don't work with sound");
    }
}
