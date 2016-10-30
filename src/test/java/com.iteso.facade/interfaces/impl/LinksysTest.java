package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class LinksysTest {
    private Linksys linksys;

    private static String LINKSYS_ON = "Linksys router is ON";
    private static String LINKSYS_OFF = "Linksys router is OFF";

    @Before
    public void setUp() {
        linksys = new Linksys();
    }

    @Test
    public void testOn() {
        assertEquals(LINKSYS_ON, linksys.on());
    }

    @Test
    public void testOff() {
        assertEquals(LINKSYS_OFF, linksys.off());
    }

    @Test
    public void testCheckInternet () {
        assertEquals("Checking internet connection" + "\nInternet connection is OK", linksys.checkInternet());
    }

}