package com.mqf.design.structural.test.obj;

import com.mqf.design.structural.test.Player;
import com.mqf.design.structural.test.Zh_JPTranslator;

public class JPMoviePlayerAdaptor implements Player {

    private Zh_JPTranslator zh_jpTranslator = new Zh_JPTranslator();
    private Player target;

    public JPMoviePlayerAdaptor(Player target) {
        this.target = target;
    }


    @Override
    public String play() {
        String play = target.play();
        String content = zh_jpTranslator.translate(play);
        System.out.println(content);
        return content;
    }
}
