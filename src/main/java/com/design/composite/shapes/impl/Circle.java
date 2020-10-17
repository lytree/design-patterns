package com.design.composite.shapes.impl;

import com.design.composite.shapes.Shape;

public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
