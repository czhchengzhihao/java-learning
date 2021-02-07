package com.study.cases;

public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boy() {

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl) {

        System.out.println("我想打" + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("符合结婚年龄");
        } else {
            System.out.println("不符合");
        }
    }
}

