package com.singleton;

/** Singleton pattern
 * Only one instance created
 * Guarantees control of a resource
 * Can be eagerly/lazily loaded
 * Examples of usage : Runtime, Logger, Spring Beans, Graphics Managers'
 *
 * Class is responsible for lifecycle
 * Static in nature
 * Needs to be threadsafe
 * Private instance
 * Private constructor
 * No parameters required for constructor
 **/

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

        if (instance == instance2){
            System.out.println("They are the same instance");
        }

    }
}
