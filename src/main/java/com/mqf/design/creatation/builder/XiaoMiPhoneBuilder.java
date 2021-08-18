package com.mqf.design.creatation.builder;

public class XiaoMiPhoneBuilder extends AbstractBuilder{

    public XiaoMiPhoneBuilder() {
        phone = new Phone();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.setCam(cam);
        return this;
    }
}
