package org.viniciusog.patterns.behavioral.state.pacman;

import org.viniciusog.patterns.behavioral.state.pacman.game.Game;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

        Ghost ghost = new Ghost();

        Game game = new Game();

        // GameEventListener has only one method: onAction (in this case, is a FunctionalInterface)
        game.addListener(option -> {
            switch (option) {
                case "1": ghost.spotPacman(); break;
                case "2": ghost.losePacman(); break;
                case "3": ghost.pacmanTurnsSpecial(); break;
                case "4": ghost.pacmanTurnsNormal(); break;
                case "5": ghost.eatenByPacman(); break;
                case "6": ghost.reactTheBase(); break;
                case "0": game.stopLoop(); break;
                default: System.out.println("Invalid option."); break;
            }
        });

        game.startLoop();

    }
}
