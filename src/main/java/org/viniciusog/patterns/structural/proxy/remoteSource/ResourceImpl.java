package org.viniciusog.patterns.structural.proxy.remoteSource;

public class ResourceImpl implements Resource {
    private String data;

    public ResourceImpl() throws InterruptedException {
        System.out.println("Loading resources");
        for (int i = 5; i > 0; i--) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        this.data = "[This is all your data]";
        System.out.println("\nResource is ready!");
    }

    @Override
    public String getData() {
        return data;
    }
}