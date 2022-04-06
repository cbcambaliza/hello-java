package com.memento;

public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(this.state);
    };
}
