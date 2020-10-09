package com.design.adapter.round;

import lombok.Data;

//圆孔
@Data
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }
    //是否适配
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
