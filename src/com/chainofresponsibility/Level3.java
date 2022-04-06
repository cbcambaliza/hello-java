package com.chainofresponsibility;

public class Level3 extends Handler{
    @Override
    public void handleRequest(int priority) {
        if (priority >= 1) {
            System.out.println("Level 3 handles priority 1 and below");
        }
    }
}
