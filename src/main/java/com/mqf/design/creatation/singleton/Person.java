package com.mqf.design.creatation.singleton;


/*
* 使用场景：
* 1.各种池，线程池，数据库连接池
* 2.系统的环境信息
* */
public class Person {

    private String name;
    private String age;

    //懒汉：用的时候才初始化
    private volatile static Person instance;
    /*
     * 对于懒汉方式，会存在线程安全问题，当多个请求进入getPerson()，如果此时并没有person实例，那么就会创建实例
     * 对此一次在  private static Person instance; 上面加上synchronized锁，这个锁相当于在类上加锁，所以只有一个线程可以访问这个类
     * 这样锁会太大，效率太低,这是把synchronized锁放在getPerson()方法里面，但是这样和在instance上加锁是一样的。
     * 最终解决方案：双重检查锁+内存可见性
     * */


    //饿汉：创建时就初始化
//    private final static Person instance = new Person();

    //构造器私有化
    private Person() {
        System.out.println("创建了Person");
    }

    public static Person getPerson() {

        //懒汉,没有实例在创建
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    Person person = new Person();
                    instance = person;
                }
            }
        }
        return instance;
    }
}
