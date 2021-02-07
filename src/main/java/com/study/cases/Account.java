package com.study.cases;

public class Account {
    private int id;//账号id
    private double balance;//余额
    private double annualInterestRate;//年利率

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }



    /**
     * 取钱
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足，区款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出" + amount + "元");

    }

    /**
     * 存钱
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (amount>0){
            System.out.println("成功存入"+amount+"元");
        }
    }
}
