package com.design.factorymethod;

import com.design.factorymethod.factory.Dialog;
import com.design.factorymethod.factory.HtmlDialog;
import com.design.factorymethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }
    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
