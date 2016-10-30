package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class EcoLightsTest {
    private EcoLights ecoLights;

    private static String ECOLIGHTS_ON = "EcoLights are ON";
    private static String ECOLIGHTS_OFF = "EcoLights are OFF";

    @Before
    public void setUp() {
        ecoLights = new EcoLights();
    }

    @Test
    public void testOn() {
        assertEquals(ECOLIGHTS_ON, ecoLights.on());
    }

    @Test
    public void testOff() {
        assertEquals(ECOLIGHTS_OFF, ecoLights.off());
    }

}