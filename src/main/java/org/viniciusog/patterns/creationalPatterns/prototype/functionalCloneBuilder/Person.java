package org.viniciusog.patterns.creationalPatterns.prototype.functionalCloneBuilder;

public class Person implements Cloneable {

    private  String name;
    private  Address address;

    private Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address clonedAddress = (Address) address.clone();
        return new Person(name, clonedAddress);
    }

    protected Builder cloneBuilder() throws CloneNotSupportedException {
        Address clonedAddress = (Address) address.clone();
        return new Builder(name, clonedAddress);
    }

    public static class Builder {
        private String name;
        private Address address;

        public Builder() {

        }

        public Builder(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person now() {
            return new Person(this.name, this.address);
        }
    }
}