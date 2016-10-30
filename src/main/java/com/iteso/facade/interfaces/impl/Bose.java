package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.SoundSystem;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bose implements SoundSystem {

    public String on() {
        return("Bose Surround System is turning ON\n"+"Bose Surround System is ON\n");
    }

    public String off() {
        return("Bose Surround System is turning OFF\n"+"Bose Surround System is OFF\n");

    }

    public String toOpticalEntry() {
        return("Changing Bose input to Optical\n");
    }
}
