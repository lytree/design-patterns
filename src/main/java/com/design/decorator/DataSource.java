package com.design.decorator;
//数据读写通用接口
public interface DataSource {
    void writeData(String data);

    String readData();
}
