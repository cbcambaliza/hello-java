package com.chainofresponsibility;

public class Level2 extends Handler {
    @Override
    public void handleRequest(int priority){
        if (priority >= 2){
            System.out.println("Level 2 handles priority 2 and below");
        }
        else
            handler.handleRequest(priority);
    }
}
