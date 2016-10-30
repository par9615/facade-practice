package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class SonyDVDTest {
    private SonyDVD sonyDVD;

    private static String SONY_ON = "Sony DVD Player is on!";
    private static String SONY_OFF = "Sony DVD Player says goodbye!";

    @Before
    public void setUp() {
        sonyDVD = new SonyDVD();
    }

    @Test
    public void testOn() {
        assertEquals(SONY_ON, sonyDVD.on());
    }

    @Test
    public void testOff() {
        assertEquals(SONY_OFF, sonyDVD.off());
    }

    @Test
    public void testInsertMovie() {
        Movie movie = new DVD("Generic movie");
        assertEquals("Sony DVD Player has " + movie + " movie", sonyDVD.insertMovie(movie));
    }

}