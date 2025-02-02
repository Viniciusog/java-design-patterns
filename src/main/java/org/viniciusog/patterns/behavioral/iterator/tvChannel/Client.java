package org.viniciusog.patterns.behavioral.iterator.tvChannel;

public class Client {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.searchAvailableChannels();
        for (Integer channel : tv) {
            System.out.println(String.format("Channel %d was found!", channel));
        }
    }
}
