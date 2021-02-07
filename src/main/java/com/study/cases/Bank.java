package com.study.cases;

public class Bank {
    private Customer_1[] customers_1;//存放多个账户的数组
    private int numberOfCustomer;//记录客户个数

    public Bank() {
        customers_1 = new Customer_1[10];
    }

    /**
     * 添加客户
     *
     * @param firstName 姓
     * @param lastName  名
     */
    public void addCustomer(String firstName, String lastName) {
        Customer_1 customer = new Customer_1(firstName, lastName);
        customers_1[numberOfCustomer++] = customer;
    }


    /**
     * 获取客户个数
     */
    public int getNumOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取指定位置的客户
     *
     * @param index
     * @return
     */
    public Customer_1 getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers_1[index];
        }
        return null;
    }

}
