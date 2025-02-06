package org.viniciusog.patterns.behavioral.state.headphone.states;

import org.viniciusog.patterns.behavioral.state.headphone.HeadPhone;

public interface HPState {
    void click(HeadPhone hp);
    void longClick(HeadPhone hp);
}
