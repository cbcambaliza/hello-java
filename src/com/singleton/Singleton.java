package com.singleton;

public class Singleton {

    /** eager loaded
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
    **/

    /** lazy loaded
    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    **/

    /** lazy loaded, threadsafe **/
    private static volatile Singleton instance = null;

    private Singleton(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
