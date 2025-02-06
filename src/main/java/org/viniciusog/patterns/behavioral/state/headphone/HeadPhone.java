package org.viniciusog.patterns.behavioral.state.headphone;

import org.viniciusog.patterns.behavioral.state.headphone.states.HPState;
import org.viniciusog.patterns.behavioral.state.headphone.states.OffState;

public class HeadPhone {

    private HPState state;
    private boolean isOn;
    private boolean isPlaying;

    public HeadPhone() {
        this.isOn = false;
        this.isPlaying = false;
        state = OffState.getInstance();
    }

    public void onLongClick() {
        System.out.println("Long click pressed...");
        state.longClick(this);
    }

    public void onClick() {
        System.out.println("Click pressed...");
        state.click(this);
    }

    public HPState getState() {
        return state;
    }

    public void setState(HPState state) {
        System.out.println(String.format("Changing from %s to %s",
                this.state.getClass().getSimpleName(), state.getClass().getSimpleName()));
        this.state = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
