package com.example.examplestatemachine;

public class AcceptState extends State {

    public AcceptState(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }


    @Override
    public void actionA() {
        super.actionA();

        if (!sc.getIsFirstActionA()) {
            sc.setState(sc.getRejectState());
        }
    }

    @Override
    public void actionB() {
        super.actionB();
        if (sc.getIsFirstActionA()) {
            sc.setState(sc.getRejectState());
        }
    }
}
