package org.viniciusog.patterns.structural.flyweight.game;

import org.viniciusog.patterns.structural.flyweight.game.model.Pixel;
import org.viniciusog.patterns.structural.flyweight.game.model.PixelTypeFactory;

import java.util.Random;

public class Map {

    private static final Integer TRYS = 10;
    private static final Integer MAP_ROWS = 10;
    private static final Integer MAP_COLUMNS = 10;

    private Pixel[][] map;
    private Integer trysRemaining;

    public Map() {
        map = createMap();
        trysRemaining = TRYS;
    }

    private Pixel[][] createMap() {
        Pixel[][] map = new Pixel[MAP_ROWS][MAP_COLUMNS];
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                Integer randomNumber = sort();
                Pixel pixel = null;
                switch (randomNumber) {
                    case 0:
                        pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('$', 100), false);
                        break;
                    case 1:
                        pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('%', 50), false);
                        break;
                    case 2:
                        pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('X', -50), false);
                        break;
                    case 3:
                        pixel = new Pixel(PixelTypeFactory.getInstance().getPixelType('@', -100), false);
                        break;
                    default:
                        pixel  = new Pixel(PixelTypeFactory.getInstance().getPixelType(' ', 0), false);
                        break;
                }
                map[row][column] = pixel;
            }
        }
        return map;
    }

    public void drawMap() {
        System.out.println("--------------");
        System.out.println(" ");
        for (int title = 0; title < MAP_COLUMNS; title++) {
            System.out.println(" " + title);
        }
        for (int row = 0; row < map.length; row++) {
            System.out.print("\n" + row);
            for (int column = 0; column < MAP_COLUMNS; column++) {
                Pixel pixel = map[row][column];
                System.out.print(" " + (pixel.isOppened() ? pixel.getType().getCharacter() : "#"));
            }
        }
        System.out.println("\nYou have " + trysRemaining + " trys left");
    }

    public Integer openCell(String coord) {
        Integer row = Integer.parseInt(coord.split(",")[0]);
        Integer column = Integer.parseInt(coord.split(",")[1]);

        Pixel chosen = map[row][column];
        if (!chosen.isOppened()) {
            chosen.setOppened(true);
            trysRemaining--;
            return chosen.getType().getTreasureReward();
        }
        return 0;
    }

    public boolean isGameOver() {
        return trysRemaining == 0;
    }

    private Integer sort() {
        Random random = new Random();
        return random.nextInt(10);
    }
}