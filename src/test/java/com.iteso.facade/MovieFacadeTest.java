package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.DVD;
import org.junit.*;

import static org.mockito.Mockito.*;

/**
 * Created by Erick on 29/10/2016.
 */
public class MovieFacadeTest {
    private static String GENERIC_MOVIE = "Generic Movie";
    private MovieFacade movieFacade;
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Router router;
    private Lights lights;
    private Movie movie;

    @Before
    public void setUp() {
        tv = mock(TV.class);
        dvdPlayer = mock(DVDPlayer.class);
        soundSystem = mock(SoundSystem.class);
        router = mock(Router.class);
        lights = mock(Lights.class);
        movie = mock(Movie.class);

        movieFacade = new MovieFacade(tv,dvdPlayer,soundSystem,router,lights,movie);
        movieFacade.playMovie(GENERIC_MOVIE);
        movieFacade.stopPlayingMovie();
    }

    @Test
    public void testTVOn() {
        verify(tv,times(1)).on();
    }

    @Test
    public void testTVToHDMI() {
        verify(tv, times(1)).toHDMI();
    }

    @Test
    public void testDVDPlayerOn() {
        verify(dvdPlayer, times(1)).on();
    }

//    @Test
//    public void testInsertMovie() {
//        verify(dvdPlayer, times(0)).insertMovie(movieReal);
//    }<<<<<<<

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
    public void testMoviePlay() {
        verify(movie, times(0)).play();
    }

    @Test
    public void testMoviePaused() {
        movieFacade.pausePlayingMovie();
        verify(movie,times(0)).pause();
    }

    @Test
    public void testLightsOnWhenPausingMovie() {
        movieFacade.pausePlayingMovie();
        verify(lights, times(2)).on();
    }

    @Test
    public void testLightsOffWhenPlayingAgain() {
        movieFacade.continuePlayingMovie();
        verify(lights, times(2)).off();
    }

    @Test
    public void testMovieContinuePlaying() {
        movieFacade.continuePlayingMovie();
        verify(movie, times(0)).play();
    }

    @Test
    public void testTVOff() {
        verify(tv, times(1)).off();
    }

    @Test
    public void testLightsOn() {
        verify(lights, times(1)).on();
    }

    @Test
    public void testDVDPlayerOff() {
        verify(dvdPlayer, times(1)).off();
    }

    @Test
    public void testSoundSystemOff() {
        verify(soundSystem, times(1)).off();
    }

    @Test
    public void testRouterOff() {
        verify(router,times(1)).off();
    }

    @Test
    public void movieStop() {
        verify(movie, times(0)).stop();
    }
}
