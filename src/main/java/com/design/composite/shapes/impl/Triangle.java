package com.design.composite.shapes.impl;

import com.design.composite.shapes.Shape;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
