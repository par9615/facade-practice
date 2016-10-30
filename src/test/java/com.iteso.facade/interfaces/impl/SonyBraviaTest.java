package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class SonyBraviaTest {
    private SonyBravia sonyBravia;

    private static String SONY_ON = "Sony Bravia is ON";
    private static String SONY_OFF = "Sony Bravia is OFF";
    private static String SONY_HDMI = "Changing Sony Bravia input to HDMI";

    @Before
    public void setUp() {
        sonyBravia = new SonyBravia();
    }

    @Test
    public void testOn() {
        assertEquals(SONY_ON, sonyBravia.on());
    }

    @Test
    public void testOff() {
        assertEquals(SONY_OFF, sonyBravia.off());
    }

    @Test
    public void testHDMI() {
        assertEquals(SONY_HDMI, sonyBravia.toHDMI());
    }

}