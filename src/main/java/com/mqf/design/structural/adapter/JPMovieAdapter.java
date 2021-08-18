package com.mqf.design.structural.adapter;


/*
* 客户调用方法的时候用适配器操作即可
*
* 类结构模式：
* 对象结构型模式：
*
* */

public class JPMovieAdapter implements Player{

    private Player target;  //被适配对象
    public JPMovieAdapter() {

    }


    @Override
    public String play() {
        String play = target.play();
        return null;
    }
}
