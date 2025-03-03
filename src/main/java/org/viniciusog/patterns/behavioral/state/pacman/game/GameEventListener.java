package org.viniciusog.patterns.behavioral.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    void onAction(String option);
}
