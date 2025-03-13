package PatternsStructural.LearningAdapter.adapters;

import PatternsStructural.LearningAdapter.round.RoundPeg;
import PatternsStructural.LearningAdapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    /**
     * Calculate a radius of the smallest circle that can fit this peg.
     * @return double the radius of the smallest circle that can fit this peg.
     */
    @Override
    public double getRadius(){
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
