package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/10/2016.
 */
public class PS3GameTest {
    private PS3Game ps3Game;

    private static String ONLINE_MODE = "Setting Online mode on ";
    private static String PLAY = "Playing ";
    private static String GENERIC_NAME = "Generic Name";

    @Before
    public void setUp() {
        ps3Game = new PS3Game(GENERIC_NAME);
    }

    @Test
    public void testSetOnlineMode() {
        assertEquals(ONLINE_MODE+ps3Game.getName(), ps3Game.setOnlineMode());
    }

    @Test
    public void testPlay() {
        assertEquals(PLAY + ps3Game.getName(), ps3Game.play());
    }

    @Test
    public void testName() {
        assertEquals(GENERIC_NAME, ps3Game.getName());
    }

}