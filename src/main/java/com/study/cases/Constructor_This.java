package com.study.cases;

/**
 * 构造器  this 的用法
 * <p>
 * <p>
 * 构造器：默认提供一个无参的构造器
 */
public class Constructor_This {


    private String name;
    private int age;

    public Constructor_This() {
    }

    public Constructor_This(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
