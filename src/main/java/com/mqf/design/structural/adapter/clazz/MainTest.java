package com.mqf.design.structural.adapter.clazz;

import com.mqf.design.structural.adapter.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        MoviePlayer moviePlayer = new MoviePlayer();
        JPMoviePlayerAdaptor jpMoviePlayerAdaptor = new JPMoviePlayerAdaptor(moviePlayer);

        jpMoviePlayerAdaptor.play();
    }

}
