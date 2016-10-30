package com.iteso.facade.interfaces.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class DualShockTest {
    private DualShock dualShock;
    private static String DUALSHOCK_ON = "DualShock wireless controller is ON\n";
    private static String DUALSHOCK_OFF = "DualShock wireless controller is OFF\n";

    @Before
    public void setUp() {
        dualShock = new DualShock();
    }

    @Test
    public void testCallingOnFunction() {
        assertEquals(DUALSHOCK_ON, dualShock.on());
    }

    @Test
    public void testCallingOffFunction() {
        assertEquals(DUALSHOCK_OFF, dualShock.off());
    }
}