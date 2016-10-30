package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.DVD;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created by simio on 27/10/2016.
 */
public class MovieFacade {
    TV tv;
    DVDPlayer dvdPlayer;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    Movie movie;

    MovieFacade( TV tv,
                 DVDPlayer dvdPlayer,
            SoundSystem soundSystem,
            Router router,
            Lights lights,
            Movie movie){

        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
        this.movie = movie;


    }


    public void playMovie(String movieName){
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        dvdPlayer.on();
        movie = new DVD(movieName);
        dvdPlayer.insertMovie(movie);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        router.on();
        router.checkInternet();

        lights.off();

        movie.play();
        System.out.println();
    }

    public void pausePlayingMovie() {
        System.out.println();
        System.out.println("Pausing the movie");
        System.out.println();
        lights.on();
        movie.pause();
    }

    public void continuePlayingMovie() {
        System.out.println();
        System.out.println("Playing movie from last point");
        System.out.println();
        lights.off();
        movie.play();
    }

    public void stopPlayingMovie(){
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        lights.on();
        tv.off();
        dvdPlayer.off();
        soundSystem.off();
        router.off();
        movie.stop();
    }




}
