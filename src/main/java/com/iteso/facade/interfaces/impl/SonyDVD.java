package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.DVDPlayer;

/**
 * Created by Erick on 27/10/2016.
 */
public class SonyDVD implements DVDPlayer{
    public void on() {
        System.out.println("Sony DVD Player is on!");
    }

    public void off() {
        System.out.println("Sony DVD Player says goodbye!");
    }

    public void insertMovie(String movie) {
        System.out.println("Sony DVD Player has " + movie + " movie");
    }
}
