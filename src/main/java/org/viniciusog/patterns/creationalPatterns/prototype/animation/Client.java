package org.viniciusog.patterns.creationalPatterns.prototype.animation;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static List<Person> frames = new ArrayList<>();

    public static Person addLeft(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.left();
        frames.add(person);
        return person;
    }

    public static Person addRight(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.right();
        frames.add(person);
        return person;
    }

    public static void animate() throws InterruptedException {
        Thread.sleep(3000);
        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PersonSamples samples = new PersonSamples();
        Person person = samples.getSample("fatMan");

        frames.add(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);

        animate();
    }
}
