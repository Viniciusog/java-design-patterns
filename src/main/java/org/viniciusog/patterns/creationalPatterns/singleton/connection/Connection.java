package org.viniciusog.patterns.creationalPatterns.singleton.connection;

public class Connection {

    private boolean inUse;

    public void query(String query) {
        System.out.println(query);
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean status) {
        inUse = status;
    }
}
