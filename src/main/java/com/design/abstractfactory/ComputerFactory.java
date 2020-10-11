package com.design.abstractfactory;

import com.design.abstractfactory.factory.ComputerAbstractFactory;
import com.design.abstractfactory.superfactory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
