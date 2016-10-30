package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Lights;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class EcoLights implements Lights {

    public String on() {
        return("EcoLights are ON");
    }


    public String off() {
        return("EcoLights are OFF");
    }
}
