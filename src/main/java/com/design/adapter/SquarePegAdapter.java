package com.design.adapter;

import com.design.adapter.round.RoundPeg;
import com.design.adapter.square.SquarePeg;
//方钉适配器
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    @Override
    public  double getRadius(){
        return Math.sqrt(Math.pow((peg.getWidth()/2),2)*2);
    }
}
