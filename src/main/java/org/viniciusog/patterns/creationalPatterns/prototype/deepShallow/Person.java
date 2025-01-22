package org.viniciusog.patterns.creationalPatterns.prototype.deepShallow;

public class Person implements Cloneable {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String otherName) {
        this.name = otherName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        Address clonedAddress = (Address) clonedPerson.getAddress().clone();
        clonedPerson.setAddress(clonedAddress);
        return clonedPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
