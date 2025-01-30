package org.viniciusog.patterns.structural.proxy.remoteSource;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws InterruptedException, IOException {

        Resource resource = new ResourceImpl();

        // lazy load
        //Resource resource = new ResourceProxy("v@lid!");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            System.out.print("Options:\n\t1-Current date"
                    + "\n\t2-Get Resource's data"
                    + "\n\t0-Exit\n");

            String option = buffer.readLine();
            switch (option) {
                case "0":
                    exit = true; break;
                case "1":
                    System.out.println(new Date()); break;
                case "2":
                    System.out.println(resource.getData()); break;
            }
        }
    }
}
