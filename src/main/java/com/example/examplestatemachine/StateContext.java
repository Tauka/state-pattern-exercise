package com.example.examplestatemachine;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class StateContext {
    State acceptState ;
    State rejectState ;
    State s;
    private Boolean isFirstActionA = null;

    public StateContext () {
        this.rejectState = new RejectState(this);
        this.acceptState = new AcceptState(this);
        s = rejectState ;
    }
    public void actionA() {
        if (isFirstActionA == null) {
            isFirstActionA = true;
        }

        s.actionA();
    }
    public void actionB() {
        if (isFirstActionA == null) {
            isFirstActionA = false;
        }

        s.actionB();
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

    public Boolean getIsFirstActionA() {
        return isFirstActionA;
    }
}
