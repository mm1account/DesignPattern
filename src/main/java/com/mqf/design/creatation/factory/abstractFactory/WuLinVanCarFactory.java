package com.mqf.design.creatation.factory.abstractFactory;

import com.mqf.design.creatation.factory.factoryMethod.RacingCar;

public class WuLinVanCarFactory extends WuLinFactory{

    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new VanCar();
    }
}
