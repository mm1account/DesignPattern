package com.mqf.design.creatation.factory.factoryMethod;

public class VanCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
