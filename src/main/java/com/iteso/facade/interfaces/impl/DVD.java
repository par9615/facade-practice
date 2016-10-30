package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by Erick on 27/10/2016.
 */
public class DVD implements Movie{
    private String name;

    public DVD (String name) {
        this.name = name;
    }

    public String play() {
        return("DVD is playing!");
    }

    public String pause() {
        return("DVD is paused!");
    }

    public String stop() {
        return("DVD stop playing!");
    }
}
