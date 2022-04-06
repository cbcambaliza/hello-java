package com.memento;

public class MementoDemo {

    public static void main(String[] args) {
        String i;

        Originator o = new Originator();
        Caretaker c = new Caretaker();

        i = "hello";
        o.setState(i);
        c.mementos.add(o.saveMemento());

        System.out.println("add: " + i);

        i = "hello2";
        o.setState(i);
        c.mementos.add(o.saveMemento());

        System.out.println("add: " + i);

        i = "hello3";
        o.setState(i);
        c.mementos.add(o.saveMemento());

        System.out.println("add: " + i);

        i = c.restoreState();
        System.out.println("restore: " + i);

        i = c.restoreState();
        System.out.println("restore: " + i);

    }
}
