package com.study.cases;

public class Account_1 {
    private double balance;


    public Account_1(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * 存钱
     *
     * @param amt
     */
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("存入" + amt + "元");
        }

    }

    public void withdraw(double amt) {
        if (balance > amt) {
            balance -= amt;
            System.out.println("成功取出" + amt + "元");
        }
    }
}
