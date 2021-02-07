package com.study.cases;

public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
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

    public void marry(Boy boy) {
        System.out.println("我想打" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     *
     * @return
     */
    public int compare(Girl girl) {

      /*  if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }*/
        return this.age - girl.age;
    }

    public static void main(String[] args) {
        Girl girl = new Girl("hhh", 18);
        Girl girl1 = new Girl("kkk", 21);
        int compare = girl.compare(girl1);
        if (compare > 0) {
            String name = girl.getName();
            System.out.println(name + "大");
        } else if (compare < 0) {
            String name1 = girl1.getName();
            System.out.println(name1 + "大");
        }
    }
}
