package com.chainofresponsibility;

public class Triage extends Handler {
    @Override
    public void handleRequest(int priority) {
        if (priority >= 4){
            System.out.println("Triage handles priority 4 and below");
        }
        else
            handler.handleRequest(priority);
    }
}
