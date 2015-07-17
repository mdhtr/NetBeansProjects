package bowlinggame;

public class Game {

    private int score = 0;

    public void roll(int pins) {
        score += pins; /* tempted to use flag to 
                          remember previous roll.  
                          So design must be wrong.*/
    }

    public int score() {
        return score;
    }
}
