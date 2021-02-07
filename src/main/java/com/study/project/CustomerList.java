package com.study.project;

public class CustomerList {
    private Customer[] customers;//保存客户对象的数组
    private int total;//记录已保存客户的数量 默认0

    /**
     * 初始化Customer数组的构造器
     *
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的客户添加到数组中
     *
     * @param customer
     * @return 添加成功true
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;

    }

    /**
     * 修改指定位置的客户信息
     *
     * @param index
     * @param customer
     * @return true修改成功
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        } else {
            return false;
        }

    }

    /**
     * 删除指定位置的客户
     *
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < total) {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            total--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取所有客户信息
     *
     * @return
     */
    public Customer[] getAllCustomer() {
        Customer[] customers1 = new Customer[total];
        //total=customers1.length
        for (int i = 0; i < customers1.length; i++) {
            customers1[i] = customers[i];
        }
        return customers1;
    }

    /**
     * 获取指定位置的客户
     *
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        if (index >= 0 && index < total) {
            return customers[index];
        }
        return null;

    }

    /**
     * 获取存储客户的数量
     *
     * @return
     */
    public int getTotal() {
        return total;

    }

}
