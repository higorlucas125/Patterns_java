package PatternsStructural.LearningAdapter.round;


/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    /**
     * get the radius of the hole
     * @return double the radius of the hole
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Check if the peg fits into the hole.
     * @param peg RoundPeg
     * @return boolean true if the peg fits into the hole, false otherwise.
     */

    public boolean fits(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
