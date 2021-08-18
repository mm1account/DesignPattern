package com.mqf.design.creatation.builder;

public class MainTest {

    public static void main(String[] args) {
        XiaoMiPhoneBuilder xiaoMiPhoneBuilder = new XiaoMiPhoneBuilder();
//       xiaoMiPhoneBuilder.customCam("1亿");
//       xiaoMiPhoneBuilder.customCpu("888");
//       xiaoMiPhoneBuilder.customDisk("512G");
        xiaoMiPhoneBuilder.customCpu("888").customCam("1亿").customDisk("512G");

        Phone product = xiaoMiPhoneBuilder.getProduct();
        System.out.println(product);
    }

}
