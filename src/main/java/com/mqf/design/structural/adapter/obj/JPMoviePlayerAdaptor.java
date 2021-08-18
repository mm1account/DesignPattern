package com.mqf.design.structural.adapter.obj;

import com.mqf.design.structural.adapter.Player;
import com.mqf.design.structural.adapter.Translator;
import com.mqf.design.structural.adapter.Zh_JPTranslator;


/*
* 组合的方式：对象结构模型，适配转换到了翻译器的功能上
* */
public class JPMoviePlayerAdaptor  implements Player {

    private Translator translate = new Zh_JPTranslator();
    private Player target; //被适配对象

    public JPMoviePlayerAdaptor(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
       String play = target.play();
       //转换字幕
        String translate = this.translate.translate(play);
        System.out.println("日文"+ this.translate);
        return play;
    }
}
