package com.mqf.design.creatation.factory.abstractFactory;

public class N95Mask extends AbstractMask{

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectedMe() {
        System.out.println("N95");
    }
}
