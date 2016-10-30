package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Erick on 29/10/2016.
 */
public class VideoGameFacadeTest {
    private static String GENERIC_VIDEOGAME = "Generic Videogame";
    private VideoGameFacade videoGameFacade;
    private TV tv;
    private GameConsole console;
    private GameController controller;
    private SoundSystem soundSystem;
    private Router router;
    private Lights lights;
    private VideoGame game;

    @Before
    public void setUp() {
        tv = mock(TV.class);
        console = mock(GameConsole.class);
        controller = mock(GameController.class);
        soundSystem = mock(SoundSystem.class);
        router = mock(Router.class);
        lights = mock(Lights.class);
        game = mock(VideoGame.class);

        videoGameFacade = new VideoGameFacade(tv, console, controller, soundSystem, router, lights);
        videoGameFacade.playOnlineGame(GENERIC_VIDEOGAME);
        videoGameFacade.stopPlayingGame();
    }

    @Test
    public void testTVToHDMI() {
        verify(tv, times(1)).toHDMI();
    }

    @Test
    public void testControllerOn() {
        verify(controller, times(1)).on();
    }

    @Test
    public void testTVOn() {
        verify(tv,times(1)).on();
    }

    @Test
    public void testConsoleOn() {
        verify(console, times(1)).on();
    }

    @Test
    public void testSoundSystemOn() {
        verify(soundSystem, times(1)).on();
    }

    @Test
    public void testToOpticalEntry() {
        verify(soundSystem, times(1)).toOpticalEntry();
    }

    @Test
    public void testRouterOn() {
        verify(router, times(1)).on();
    }

    @Test
    public void testCheckInternet() {
        verify(router, times(1)).checkInternet();
    }

    @Test
    public void testLightsOff() {
        verify(lights, times(1)).off();
    }

    @Test
    public void testSetOnlineMode() {
        verify(game, times(0)).setOnlineMode();
    }

    @Test
    public void testPlayGame() {
        verify(game,times(0)).play();
    }

    @Test
    public void testLightsOn() {
        verify(lights, times(1)).on();
    }

    @Test
    public void testTVOff() {
        verify(tv, times(1)).off();
    }

    @Test
    public void testControllerOff() {
        verify(controller, times(1)).off();
    }

    @Test
    public void testConsoleOff() {
        verify(console, times(1)).off();
    }

    @Test
    public void testSoundSystemOff() {
        verify(soundSystem, times(1)).off();
    }

    @Test
    public void testRouterOff() {
        verify(router,times(1)).off();
    }
}
