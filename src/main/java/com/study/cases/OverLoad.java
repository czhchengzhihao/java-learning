package com.study.cases;

/**
 * 重载  方法名称相同，在同一个类中
 *       参数个数不同，参数类型不同
 */
public class OverLoad {
    public static void main(String[] args) {

    }


    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j, double m) {
        double v = (i > j) ? i : j;

        return (v > m) ? v : m;
    }
}
