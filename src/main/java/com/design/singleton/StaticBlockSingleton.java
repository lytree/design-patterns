package com.design.singleton;

//静态代码块单例模式
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public StaticBlockSingleton getInstance(){
        return instance;
    }
}
