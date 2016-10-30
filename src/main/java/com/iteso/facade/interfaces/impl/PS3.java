package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class PS3 implements GameConsole {

    public String on() {
        return("Play Station 3 is ON\n");
    }


    public String off() {
        return("Play Station 3 is OFF\n");

    }

    public String insertGame(VideoGame videoGame) {
        return(videoGame.getName() + " has been inserted into Play Station 3\n");
    }
}
