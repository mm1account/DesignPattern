package com.mqf.design.creatation.factory.abstractFactory;

public class WuLinN95MaskFactory extends WuLinFactory{
    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }

    @Override
    AbstractCar newCar() {
        return null;
    }
}
