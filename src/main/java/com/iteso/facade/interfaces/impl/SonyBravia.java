package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.TV;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SonyBravia implements TV {

    public String on() {
        return("Sony Bravia is ON");
    }

    public String off() {
        return("Sony Bravia is OFF");
    }

    public String toHDMI() {
        return("Changing Sony Bravia input to HDMI");
    }
}
