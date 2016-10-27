package com.iteso.facade;

import com.iteso.facade.interfaces.*;

/**
 * Created by simio on 27/10/2016.
 */
public class MovieFacade {
    TV tv;
    DVDPlayer dvdPlayer;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;

    MovieFacade( TV tv,
                 DVDPlayer dvdPlayer,
            GameController controller,
            SoundSystem soundSystem,
            Router router,
            Lights lights,
            VideoGame game){

        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;


    }


}
