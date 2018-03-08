package com.example.examplestatemachine;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class StateContext {
    State acceptState ;
    State rejectState ;
    State s;
    Boolean isFirstActionA = null;

    public StateContext () {
        this.rejectState = new ConcreteState(this, false);
        this.acceptState = new ConcreteState(this, true);
        s = rejectState ;
    }
    public void actionA() {
        if (isFirstActionA == null) {
            isFirstActionA = true;
        }

        if (isFirstActionA == true) {
            s.actionA();
        }

        if (isFirstActionA == false) {
            s.actionB();
        }

    }
    public void actionB() {
        if (isFirstActionA == null) {
            isFirstActionA = false;
        }

        if (isFirstActionA == true) {
            s.actionB();
        }

        if (isFirstActionA == false) {
            s.actionA();
        }

    }

    public boolean isAccept() {
        return s.isAccept();
    }

    public void setState(State s) {
        this.s = s;
    }

    public State getAcceptState() {
        return this.acceptState;
    }

    public State getRejectState() {
        return this.rejectState;
    }
}
