package com.mqf.design.structural.test;

public class Zh_JPTranslator implements Translator{

    @Override
    public String translate(String content) {
        if("你好".equals(content)) {
           return "123";
        }else {
            return "***";
        }

    }
}
