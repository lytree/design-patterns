package com.design.singleton;

import java.io.Serializable;
//单例模式序列化

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    //序列化单例类的问题在于，每当我们取消序列化时，它都会创建该类的新实例
    //解决方法
    protected Object readResolve() {
        return getInstance();
    }
}
