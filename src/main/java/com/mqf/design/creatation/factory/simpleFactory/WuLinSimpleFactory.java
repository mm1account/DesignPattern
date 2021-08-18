package com.mqf.design.creatation.factory.simpleFactory;

/*
* 简单工厂
*  产品数量有限
* */
public class WuLinSimpleFactory {

    public AbstractCar newCar(String type) {
        if("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        return null;
    }

}
