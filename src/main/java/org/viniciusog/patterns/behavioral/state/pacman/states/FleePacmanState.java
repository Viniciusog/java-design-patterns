package org.viniciusog.patterns.behavioral.state.pacman.states;

import org.viniciusog.patterns.behavioral.state.pacman.Ghost;

public class FleePacmanState implements GhostState {

    private static final FleePacmanState instance = new FleePacmanState();

    private FleePacmanState() {

    }

    public static FleePacmanState getInstance() {
        return instance;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("Turn back...");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("PacMan loses ME");
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("I know, im already running.");
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("that was close, ill find him again!");
        ghost.setState(WanderMazeState.getInstance());
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Ill be back!");
        ghost.setState(ReturnToBaseState.getInstance());
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("I wasnt going to the base... yet!");
    }
}