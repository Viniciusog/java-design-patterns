package org.viniciusog.patterns.behavioral.state.pacman.states;

import org.viniciusog.patterns.behavioral.state.pacman.Ghost;

public class ChasePacmanState implements GhostState {

    private static final ChasePacmanState instance = new ChasePacmanState();

    private ChasePacmanState() {

    }

    public static ChasePacmanState getInstance() {
        return instance;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("Im already chasing him...");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("The pacman ran away, lets find him again!");
        ghost.setState(WanderMazeState.getInstance());
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("Better hide!");
        ghost.setState(FleePacmanState.getInstance());
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("He was normal already...");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Its impossible to be eaten by a normal pacman...");
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("i wasnt going to the base.");
    }
}