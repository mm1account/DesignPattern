package com.mqf.design.structural.adapter.obj;

import com.mqf.design.structural.adapter.MoviePlayer;

public class MainTest {

    public static void main(String[] args) {

        JPMoviePlayerAdaptor jpMoviePlayerAdaptor = new JPMoviePlayerAdaptor(new MoviePlayer());
        jpMoviePlayerAdaptor.play();


    }

}
