package org.viniciusog.patterns.behavioral.state.pacman;

import org.viniciusog.patterns.behavioral.state.pacman.states.GhostState;
import org.viniciusog.patterns.behavioral.state.pacman.states.WanderMazeState;

public class Ghost {

    private GhostState state = WanderMazeState.getInstance();

    public GhostState getState() {
        return state;
    }

    public void setState(GhostState state) {
        System.out.println(String.format("Changing from %s to %s",
                this.state.getClass().getSimpleName(), state.getClass().getSimpleName()));
        this.state = state;
    }

    public void spotPacman() {
        state.spotPacman(this);
    }

    public void losePacman() {
        state.losePacman(this);
    }

    public void pacmanTurnsSpecial() {
        state.pacmanTurnsSpecial(this);
    }

    public void pacmanTurnsNormal() {
        state.pacmanTurnsNormal(this);
    }

    public void eatenByPacman() {
        state.eatenByPacman(this);
    }

    public void reactTheBase() {
        state.reachTheBase(this);
    }
}