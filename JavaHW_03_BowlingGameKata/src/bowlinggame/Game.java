package bowlinggame;

public class Game {

    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] + rolls[i + 1] == 10) {// spare
                score += ...
            }
            score += rolls[i];
        }
        return score;
    }

    /*
     This isn’t going to work because i might not refer to the first ball of the frame.

     Design is still wrong.

     Need to walk through array two balls (one frame) at a time.
     */
}
