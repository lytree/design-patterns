package com.design.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

    }
}
/*
instanceOne hashCode=312714112
instanceTwo hashCode=2065951873
hashcode不一致非同一个对象
序列化中添加
protected Object readResolve() {
    return getInstance();
}
 */