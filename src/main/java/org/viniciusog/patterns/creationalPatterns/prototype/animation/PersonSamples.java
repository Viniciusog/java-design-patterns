package org.viniciusog.patterns.creationalPatterns.prototype.animation;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {
    Map<String, Person> samples;

    public PersonSamples() {
         samples = new HashMap<>();
         loadSamples();
    }

    public Person getSample(String type) {
        return samples.get(type);
    }

    private void loadSamples() {
        samples.put("stickMan", new Person(
                "                       ",
                "           o           ",
                "          /|\\         ",
                "__________/_\\__________"
        ));

        samples.put("fatMan", new Person(
                "                           ",
                "          (^ ^)            ",
                "          <)    )\\        ",
                "___________/___\\___________"
        ));
    }
}
