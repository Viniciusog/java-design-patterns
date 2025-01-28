package org.viniciusog.patterns.structural.flyweight.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        Map map = new Map();
        Integer score = 0;
        Integer reward = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while (!map.isGameOver()) {
            map.drawMap();
            System.out.println("Score: " + score);
            System.out.println("Enter a coord (line,column): ");
            String coord = buffer.readLine();
            reward = map.openCell(coord);
            score += reward;
            System.out.println("Reward: " + reward + " points.");
            Thread.sleep(1000);
        }
        System.out.println("Final score: " + score);
    }
}
