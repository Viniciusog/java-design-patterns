package org.viniciusog.patterns.structural.adapter.tvPort;

import org.viniciusog.patterns.structural.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import org.viniciusog.patterns.structural.adapter.tvPort.adapters.HDMIToVGAAdapter;
import org.viniciusog.patterns.structural.adapter.tvPort.devices.Computer;
import org.viniciusog.patterns.structural.adapter.tvPort.devices.OldMonitor;
import org.viniciusog.patterns.structural.adapter.tvPort.devices.TV;

public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();
        OldMonitor oldMonitor = new OldMonitor();
        TV tv = new TV();

        //computer.connectPort(tv);
        //computer.sendImageAndSound("Car", "car sound");

        //computer.connectPort(new HDMIToVGAAdapter(oldMonitor));
        //computer.sendImageAndSound("Rocket", "rocket sound");

        // the class works as adapter
        computer.connectPort(new HDMIToOldMonitorAdapter());
        computer.sendImageAndSound("Mountain", "wind sound");
    }
}
