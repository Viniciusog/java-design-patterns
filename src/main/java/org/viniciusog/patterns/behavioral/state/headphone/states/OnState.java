package org.viniciusog.patterns.behavioral.state.headphone.states;

import org.viniciusog.patterns.behavioral.state.headphone.HeadPhone;

public class OnState implements HPState {
    private static final HPState instance = new OnState();

    private OnState() {

    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(true);
        hp.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(false);
        hp.setState(OffState.getInstance());
    }

    public static HPState getInstance() {
        return instance;
    }
}
