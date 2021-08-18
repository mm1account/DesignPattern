package com.mqf.design.creatation.factory.factoryMethod;

public class MainTest {

    public static void main(String[] args) {
        VanCarFactory vanCarFactory = new VanCarFactory();
        VanCar vancar = (VanCar) vanCarFactory.newCar();
        vancar.run();
    }

}
