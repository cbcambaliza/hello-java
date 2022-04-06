package com.chainofresponsibility;

/** Chain of Responsibility Pattern
 * Decoupling of sender and receiver
 * Receiver contains reference to next receiver
 * Promotes loose coupling
 * No Handler - OK
 * Examples: java.util.logging.Logger#log(), javax.servlet.Filter#doFilter()
 *
 * Chain of receiver objects
 * Handler is Interface based
 * ConcreteHandler for each implementation
 * Each Handler has a reference to the next
 * Handler, ConcreteHandler
 */

public class ChainOfResponsibilityDemo {

    public static void main(String[] args){
        Triage triage = new Triage();
        Level2 l2 = new Level2();
        Level3 l3 = new Level3();

        triage.setHandler(l2);
        l2.setHandler(l3);

        triage.handleRequest(5);
        triage.handleRequest(1);

    }
}
