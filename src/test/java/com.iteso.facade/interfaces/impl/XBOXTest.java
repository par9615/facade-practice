package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;
import com.iteso.facade.interfaces.VideoGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class XBOXTest {
    private XBOX xbox;

    private static String XBOX_ON = "XBOX 360 is ON";
    private static String XBOX_OFF = "XBOX 360 is OFF";

    @Before
    public void setUp() {
        xbox = new XBOX();
    }

    @Test
    public void testOn() {
        assertEquals(XBOX_ON, xbox.on());
    }

    @Test
    public void testOff() {
        assertEquals(XBOX_OFF, xbox.off());
    }

    @Test
    public void testInsertMovie() {
        VideoGame videoGame = new PS3Game("Generic game");
        assertEquals(videoGame.getName() + " has been inserted into Play Station 3", xbox.insertGame(videoGame));
    }
}