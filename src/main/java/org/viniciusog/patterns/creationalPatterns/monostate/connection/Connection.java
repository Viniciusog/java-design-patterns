package org.viniciusog.patterns.creationalPatterns.monostate.connection;

public class Connection {

    private boolean inUse;

    public void query(String query) {
        System.out.println(query);
    }

    public boolean inUse() {
        return this.inUse;
    }

    public void setInUse(boolean state) {
        this.inUse = state;
    }
}
