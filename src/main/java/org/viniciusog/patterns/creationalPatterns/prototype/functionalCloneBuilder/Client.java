package org.viniciusog.patterns.creationalPatterns.prototype.functionalCloneBuilder;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address.Builder("country", "state", "city").now();
        Person p1 = new Person.Builder()
                .withName("Name")
                .withAddress(address)
                .now();

        Person p2 = p1.cloneBuilder().now();

        // must have different Address hashCode since these objects don't share same memory space
        System.out.println(System.identityHashCode(p1.getAddress()));
        System.out.println(System.identityHashCode(p2.getAddress()));
    }
}