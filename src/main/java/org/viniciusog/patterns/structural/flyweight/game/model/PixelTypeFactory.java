package org.viniciusog.patterns.structural.flyweight.game.model;

import java.util.HashMap;
import java.util.Map;

public class PixelTypeFactory {

    private static PixelTypeFactory instance = new PixelTypeFactory();
    private static Map<Character, PixelType> pixelTypeRepository;

    public PixelTypeFactory() {
        pixelTypeRepository = new HashMap<>();
    }

    public static PixelTypeFactory getInstance() {
        return instance;
    }

    public PixelType getPixelType(Character character, Integer treasureReward) {
        PixelType pt = pixelTypeRepository.get(character);

        if (pt == null) {
            System.out.println("Creating new flyweight for " + character);
            pt = new PixelType(character, treasureReward);
            pixelTypeRepository.put(character, pt);
        }
        return pt;
    }
}