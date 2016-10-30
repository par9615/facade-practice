package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Router;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Linksys implements Router {

    public String on() {
        return("Linksys router is ON");
    }


    public String off() {
        return("Linksys router is OFF");
    }


    public String checkInternet() {
        return("Checking internet connection" + "\nInternet connection is OK");
    }
}
