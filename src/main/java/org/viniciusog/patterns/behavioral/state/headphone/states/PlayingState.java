package org.viniciusog.patterns.behavioral.state.headphone.states;

import org.viniciusog.patterns.behavioral.state.headphone.HeadPhone;

public class PlayingState implements HPState {

    private static HPState instance = new PlayingState();

    private PlayingState() {
    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(false);
        System.out.println("> Stop Player");
        hp.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(false);
        System.out.println("> Turning Off");
        hp.setState(OffState.getInstance());
    }

    public static HPState getInstance() {
        return instance;
    }
}