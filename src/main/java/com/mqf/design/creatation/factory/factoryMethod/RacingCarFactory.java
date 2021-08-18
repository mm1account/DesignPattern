package com.mqf.design.creatation.factory.factoryMethod;

public class RacingCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
