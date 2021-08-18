package com.mqf.design.structural.test.clazz;

import com.mqf.design.structural.test.Player;
import com.mqf.design.structural.test.Translator;
import com.mqf.design.structural.test.Zh_JPTranslator;

public class JPMoviePlayerAdaptor extends Zh_JPTranslator implements Player {

    private Player target;

    public JPMoviePlayerAdaptor(Player target) {
        this.target = target;
    }


    @Override
    public String play() {
        String content = target.play();
        String con = translate(content);
        System.out.println(con);
        return con;
    }
}
