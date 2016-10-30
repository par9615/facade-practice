package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.DVDPlayer;
import com.iteso.facade.interfaces.Movie;

/**
 * Created by Erick on 27/10/2016.
 */
public class SonyDVD implements DVDPlayer{

    public String on() {
        return("Sony DVD Player is on!");
    }

    public String off() {
        return("Sony DVD Player says goodbye!");
    }

    public String insertMovie(Movie movie) {
        return("Sony DVD Player has " + movie + " movie");
    }
}
