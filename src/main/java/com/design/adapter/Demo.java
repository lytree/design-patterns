package com.design.adapter;

import com.design.adapter.round.RoundHole;
import com.design.adapter.round.RoundPeg;
import com.design.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(6);
        RoundPeg roundPeg = new RoundPeg(7);

        if (roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }
        SquarePeg squarePeg = new SquarePeg(2);
        SquarePeg squarePeg1 = new SquarePeg(20);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);

        if (roundHole.fits(squarePegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(squarePegAdapter1)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
