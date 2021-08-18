package com.mqf.design.creatation.factory.factoryMethod;

public class MiniCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
