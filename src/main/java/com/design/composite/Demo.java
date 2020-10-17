package com.design.composite;

import com.design.composite.shapes.Drawing;
import com.design.composite.shapes.Shape;
import com.design.composite.shapes.impl.Circle;
import com.design.composite.shapes.impl.Triangle;

public class Demo {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
