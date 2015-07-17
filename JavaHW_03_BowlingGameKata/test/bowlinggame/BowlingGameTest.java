package bowlinggame;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score()); 
    }

    public void testAllOnes() throws Exception {
        Game g = new Game(); // game creation is duplicated
        for (int i = 0; i < 20; i++) { // roll loop is duplicated
            g.roll(1); 
        }
        assertEquals(20, g.score()); // Failed: expected:<20> but was:<0>
    }
}
