package org.viniciusog.patterns.creationalPatterns.prototype.animation;

public class Person implements Cloneable {
    private String line1;
    private String line2;
    private String line3;
    private String line4;

    public Person(String line1, String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public void left() {
        this.line1 = line1.substring(1);
        this.line2 = line2.substring(1);
        this.line3 = line3.substring(1);
        this.line4 = line4.substring(1);
    }

    void right() {
        this.line1 = " " + line1;
        this.line2 = " " + line2;
        this.line3 = " " + line3;
        this.line4 = "_" + line4;
    }

    void draw() {
        System.out.println("");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
