package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 29/10/2016.
 */
public class BoseTest {
    private Bose bose;
    private static String BOSE_TURNING_ON = "Bose Surround System is turning ON\n";
    private static String BOSE_ON = "Bose Surround System is ON\n";
    private static String BOSE_TURNING_OFF = "Bose Surround System is turning OFF\n";
    private static String BOSE_OFF = "Bose Surround System is OFF\n";
    private static String BOSE_TO_OPTICAL = "Changing Bose input to Optical\n";

    @Before
    public void setUp() {
        bose = new Bose();
    }

    @Test
    public void testCallingOnFunction() {
        assertEquals(BOSE_TURNING_ON+BOSE_ON, bose.on());
    }

    @Test
    public void testCallingOffFunction() {
        assertEquals(BOSE_TURNING_OFF+BOSE_OFF, bose.off());
    }

    @Test
    public void testtoOpticalEntry() {
        assertEquals(BOSE_TO_OPTICAL, bose.toOpticalEntry());
    }
}
