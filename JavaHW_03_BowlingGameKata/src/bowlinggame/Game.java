package bowlinggame;

public class Game {

    private int score = 0;

    public void roll(int pins) { // roll() calculates score, but name does not imply that.
        score += pins; 
    }

    public int score() { // score() does not calculate score, but name implies that it does.
        return score;
    }
    // Design is wrong.  Responsibilities are misplaced.
}
