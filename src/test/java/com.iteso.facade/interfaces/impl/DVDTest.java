package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/10/2016.
 */
public class DVDTest {
    private DVD dvd;
    private static String DVD_PLAY = "DVD is playing!";
    private static String DVD_PAUSE = "DVD is paused!";
    private static String DVD_STOP = "DVD stop playing!";

    @Before
    public void setUp() {
        dvd = new DVD("Generic Game");
    }

    @Test
    public void testPlay() {
        assertEquals(DVD_PLAY, dvd.play());
    }

    @Test
    public void testPause() {
        assertEquals(DVD_PAUSE, dvd.pause());
    }

    @Test
    public void testStop() {
        assertEquals(DVD_STOP, dvd.stop());
    }
}