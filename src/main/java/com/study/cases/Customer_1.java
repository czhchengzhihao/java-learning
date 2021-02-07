package com.study.cases;

public class Customer_1 {
    private String firstName;
    private String lastName;
    private Account_1 account_1;

    public Customer_1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account_1 getAccount_1() {
        return account_1;
    }

    public void setAccount_1(Account_1 account_1) {
        this.account_1 = account_1;
    }
}
