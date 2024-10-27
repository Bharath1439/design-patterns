package com.example.design_patterns.singleton;

public class MultiThreadSingleton {

    private MultiThreadSingleton(){

    }
    public static MultiThreadSingleton singleton=null;

    public static MultiThreadSingleton getInstance(){
        if(singleton==null){
            synchronized(MultiThreadSingleton.class) {
                if (singleton == null) {
                    singleton = new MultiThreadSingleton();
                }
            }
        }
        return singleton;
    }
}
