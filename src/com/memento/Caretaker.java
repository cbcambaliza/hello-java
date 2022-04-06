package com.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    List<Memento> mementos = new ArrayList();

    public String restoreState(){
        mementos.remove(mementos.size() - 1);
        return mementos.get(mementos.size() - 1).getSavedState();
    }

}
