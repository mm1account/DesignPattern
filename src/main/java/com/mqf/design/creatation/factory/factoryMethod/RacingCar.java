package com.mqf.design.creatation.factory.factoryMethod;

public class RacingCar extends AbstractCar{

    public RacingCar() {
        this.engine = "赛车";
    }

    @Override
    void run() {
        System.out.println(engine+"...");
    }
}
