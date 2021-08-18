package com.mqf.design.creatation.factory.simpleFactory;

public class MainTest {

    public static void main(String[] args) {
        WuLinSimpleFactory wuLinSimpleFactory = new WuLinSimpleFactory();

        AbstractCar mini = wuLinSimpleFactory.newCar("mini");
        mini.run();
    }
}
