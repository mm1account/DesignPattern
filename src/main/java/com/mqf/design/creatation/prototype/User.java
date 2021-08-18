package com.mqf.design.creatation.prototype;

/*
 * 当前对象可克隆
 * */
public class User implements Cloneable {

    private String name;
    private Integer age;

    public User() {
        System.out.println("User对象创建");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 再创建一个User，并赋予属性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }
}
