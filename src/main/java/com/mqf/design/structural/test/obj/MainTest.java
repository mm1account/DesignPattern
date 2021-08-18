package com.mqf.design.structural.test.obj;

import com.mqf.design.structural.test.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        JPMoviePlayerAdaptor jpMoviePlayerAdaptor = new JPMoviePlayerAdaptor(new MoviePlayer());
        jpMoviePlayerAdaptor.play();

    }

}
