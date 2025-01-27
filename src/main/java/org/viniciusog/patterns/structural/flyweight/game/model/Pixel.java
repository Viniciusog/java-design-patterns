package org.viniciusog.patterns.structural.flyweight.game.model;

public class Pixel {

    private PixelType type;
    private boolean oppened;

    public Pixel(PixelType type, boolean oppened) {
        this.type = type;
        this.oppened = oppened;
    }

    public void setType(PixelType type) {
        this.type = type;
    }

    public void setOppened(boolean oppened) {
        this.oppened = oppened;
    }

    public PixelType getType() {
        return type;
    }

    public boolean isOppened() {
        return oppened;
    }
}
