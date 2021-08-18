package com.mqf.design.creatation.prototype;


/*
* 用于创建重复的对象，同时又能保证性能
* 场景：操作数据库，从数据库中查询到很多记录（70%改变很少）
* 每次查数据库，查到以后把所有数据都封装成对象返回
*   10000 thread：查一个记录，new User("zhangsan",18),每次创建一个对象封装并返回
*   系统里就会有10000个User，浪费内存
* 解决：缓存：查过的保存
*       如果再查相同的记录，拿到原来的原型对象
* */

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mybatis mybatis = new Mybatis();
        User user1 = mybatis.getUser("张三");
        User user2 = mybatis.getUser("张三");
        User user3 = mybatis.getUser("张三");
        User user4 = mybatis.getUser("张三");
        User user5 = mybatis.getUser("张三");
    }
}
