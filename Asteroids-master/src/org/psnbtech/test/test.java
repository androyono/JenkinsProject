import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {
    Clock clock;
    @Before
    public void setUp(){
        clock = new Clock(1.0F);
    }

    @Test
    public void testReset() {
        clock.elapsedCycles = 100;
        clock.reset();
        assertEquals(0, clock.elapsedCycles);
    }

    @Test
    public void testIsPaused() {
        clock.isPaused = false;
        assertFalse(clock.isPaused);
    }
}