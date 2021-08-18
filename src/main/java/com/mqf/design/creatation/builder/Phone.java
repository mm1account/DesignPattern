package com.mqf.design.creatation.builder;

public class Phone {

    protected String cpu;
    protected String disk;
    protected String cam;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}
