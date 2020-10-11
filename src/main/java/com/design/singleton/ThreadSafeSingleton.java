package com.design.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }
    //单重校验
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    //双重校验
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if (instance == null){
            synchronized (ThreadSafeSingleton.class){
                if (instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
