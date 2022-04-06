package com.chainofresponsibility;

public abstract class Handler {

    public Handler handler;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    public abstract void handleRequest(int priority);

}
