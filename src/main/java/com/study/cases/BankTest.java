package com.study.cases;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("程", "志豪");
        bank.getCustomer(0).setAccount_1(new Account_1(2000));
        bank.getCustomer(0).getAccount_1().withdraw(500);
        bank.getCustomer(0).getAccount_1().getBalance();
        double balance = bank.getCustomer(0).getAccount_1().getBalance();
        System.out.println("客户" + bank.getCustomer(0).getFirstName() + "账户余额为" + balance);
    }
}
