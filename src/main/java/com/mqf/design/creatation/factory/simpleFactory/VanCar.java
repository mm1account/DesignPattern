package com.mqf.design.creatation.factory.simpleFactory;

public class VanCar extends AbstractCar{

    public VanCar() {
        this.engine = "货车引擎";
    }

    @Override
    void run() {
        System.out.println(engine+"货车");
    }
}
