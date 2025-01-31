package org.viniciusog.patterns.behavioral.command.alexa.alexa;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {

    private Map<String, String[]> associations;

    public AlexaAI() {
        associations = new HashMap<>();
    }

    public void addAssociation(String key, String[] association) {
        associations.put(key, association);
    }

    // Verifica se a frase do request contém algum dos conjuntos de palavras-chave
    public String getFindAssociations(String request) {
        for (String[] association : associations.values()) {
            if (Stream.of(association).allMatch(request::contains)) {
                return getKeyFromAssociation(association);
            }
        }
        return null;
    }

    private String getKeyFromAssociation(String... keywords) {
        return associations.entrySet()
                .stream()
                .filter(entry -> keywords.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}