package com.mqf.design.creatation.factory.simpleFactory;

public class MiniCar extends AbstractCar{

    public MiniCar() {
        this.engine = "家用小车";
    }

    @Override
    void run() {
        System.out.println(engine+"家用");
    }
}
