package com.design.factorymethod.factory;

import com.design.factorymethod.Button;
import com.design.factorymethod.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
