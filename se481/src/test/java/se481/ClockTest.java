package se481;

import static org.junit.Assert.*;
import org.psnbtech.util.Clock;

import org.junit.Before;
import org.junit.Test;

public class ClockTest {
    Clock clock;
    @Before
    public void setUp(){
        clock = new Clock(1.0F);
    }

    @Test
    public void testResetElapsedTime() {
        clock.elapsedCycles = 5;
        clock.reset();
        assertTrue(clock.elapsedCycles == 0);
    }

    @Test
    public void testLastUpdate() {
    	clock.lastUpdate = 5;
        assertFalse(clock.lastUpdate == 10);
    }
}