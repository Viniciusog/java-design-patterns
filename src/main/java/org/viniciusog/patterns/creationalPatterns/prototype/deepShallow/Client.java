package org.viniciusog.patterns.creationalPatterns.prototype.deepShallow;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("PersonName", new Address("Brazil", "São Paulo", "City"));

        Person clonedPerson = (Person) person.clone();
        clonedPerson.setName("CloneName");
        // clonedPerson has a cloned address (implementation inside clone method in Person)
        clonedPerson.getAddress().setCity("NewCityForClonedPerson");

        System.out.println(person);
        System.out.println(clonedPerson);
    }
}
