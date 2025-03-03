package org.viniciusog.patterns.behavioral.state.pacman.states;

import org.viniciusog.patterns.behavioral.state.pacman.Ghost;

public class ReturnToBaseState implements GhostState {

    private static final ReturnToBaseState instance = new ReturnToBaseState();

    private ReturnToBaseState() {}

    public static ReturnToBaseState getInstance() {
        return instance;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("I'll haunt him, but now i'm in the base.");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("I'm in the base");
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("I saw!");
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("Too late!");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Again? I'm in the base!");
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("It's clear now! i want my revenge!");
        ghost.setState(WanderMazeState.getInstance());
    }
}