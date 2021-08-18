package com.mqf.design.structural.adapter;

/*
* 适配器
*   1.系统中已存在的Player和Translate没有任何关系
*   2.我们在不改变系统的基础上实现功能就需要使用适配器
*
* 系统原来的接口不发生改变。扩展一个新的类，来连接两个之前没关系的类
*
*
* */


public class MoviePlayer implements Player{


    @Override
    public String play() {

        System.out.println("正在播放：宋老师的宝贵时间.avi");
        String content= "你好";
        System.out.println(content);  //并且打印出字幕
        return content;
    }
}
