package com.design.factorymethod.factory;

import com.design.factorymethod.Button;
import com.design.factorymethod.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
