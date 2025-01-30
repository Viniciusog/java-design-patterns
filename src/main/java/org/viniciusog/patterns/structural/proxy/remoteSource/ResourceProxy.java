package org.viniciusog.patterns.structural.proxy.remoteSource;

public class ResourceProxy implements Resource {
    private Resource realResource;
    private String validToken = "v@lid!";
    private String tokenProvided;

    public ResourceProxy(String tokenProvided) {
        this.tokenProvided = tokenProvided;
    }

    @Override
    public String getData() throws InterruptedException {
        if (!tokenProvided.equals(validToken)) return "Invalid token";
        // execute heavy work only in the first time
        if (realResource == null) {
            try {
                realResource = new ResourceImpl();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realResource.getData();
    }
}
