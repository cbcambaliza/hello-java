package com.memento;

public class Memento {

    private String state;

    public Memento(String stateSave){
        this.state = stateSave;
    }

    public String getSavedState(){
        return state;
    }
}
