package org.viniciusog.patterns.creationalPatterns.prototype.functionalCloneBuilder;

public class Address implements Cloneable {

    private final String country;
    private final String state;
    private final String city;

    public Address(String country, String state, String city) {
        super();
        this.country = country;
        this.state = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}