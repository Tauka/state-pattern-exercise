package com.example.examplestatemachine;

public class ConcreteState extends State {

    public ConcreteState(StateContext sc, Boolean isAccept) {
        this.sc = sc;
        this.accept = isAccept;
    }


    @Override
    public void actionA() {
        super.actionA();
        sc.setState(sc.getAcceptState());
    }

    @Override
    public void actionB() {
        super.actionB();
        sc.setState(sc.getRejectState());
    }
}
