package com.iteso.facade.interfaces.impl;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/10/2016.
 */
public class PS3Test {
    private static String PLAY_ON = "Play Station 3 is ON\n";
    private static String PLAY_OFF ="Play Station 3 is OFF\n";
    private static String INSERT_GAME = " has been inserted into Play Station 3\n";
    private PS3 ps3;

    @Before
    public void setUp() {
        ps3 = new PS3();
    }

    @Test
    public void testCallingOnFunction() {
        assertEquals(PLAY_ON, ps3.on());
    }

    @Test
    public void testCallingOffFunction() {
        assertEquals(PLAY_OFF, ps3.off());
    }

    @Test
    public void testInsertGame() {
        PS3Game ps3Game = new PS3Game("Generic Game");
        assertEquals(ps3Game.getName() + INSERT_GAME, ps3.insertGame(ps3Game));
    }
}