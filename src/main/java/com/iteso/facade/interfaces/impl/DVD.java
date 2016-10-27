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

    public void play() {
        System.out.println("DVD is playing!");
    }

    public void pause() {
        System.out.println("DVD is paused!");
    }

    public void stop() {
        System.out.println("DVD stop playing!");
    }
}
