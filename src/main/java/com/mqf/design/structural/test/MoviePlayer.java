package com.mqf.design.structural.test;

public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("播放：功夫");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
