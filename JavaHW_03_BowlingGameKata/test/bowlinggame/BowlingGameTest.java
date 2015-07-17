package bowlinggame;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

    private Game g;

    @Override
    protected void setUp() throws Exception {
        g = new Game(); // game creation is not duplicated anymore.
    }

    public void testGutterGame() throws Exception {

        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }

    public void testAllOnes() throws Exception {

        for (int i = 0; i < 20; i++) { // roll loop is duplicated
            g.roll(1);
        }
        assertEquals(20, g.score());
    }
    
    // Both tests passed.
}
