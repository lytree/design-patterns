package com.design.prototype;

import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeesPrototype emps = new EmployeesPrototype();
        emps.loadData();

        //Use the clone method to get the Employee object
        EmployeesPrototype empsNew = (EmployeesPrototype) emps.clone();
        EmployeesPrototype empsNew1 = (EmployeesPrototype) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
