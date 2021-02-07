package com.study.project;

public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    /**
     * 显示界面
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("客户管理软件");
            System.out.println("1.添加客户");
            System.out.println("2.修改客户");
            System.out.println("3删除客户");
            System.out.println("4客户列表");
            System.out.println("5退出");
            System.out.println("请选择1-5：");
            char menu = CMUtil.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("退出");
                    System.out.print("确认是否退出（Y/N)");
                    char isExit = CMUtil.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }


    }

    /**
     * 添加客户
     */
    public void addNewCustomer() {
        System.out.println("添加客户");
        System.out.print("姓名：");
        String name = CMUtil.readString(10);
        System.out.print("性别：");
        char gender = CMUtil.readChar();
        System.out.print("年龄：");
        int age = CMUtil.readInt();
        System.out.print("手机号码：");
        String phone = CMUtil.readString(11);
        System.out.print("电子邮箱：");
        String email = CMUtil.readString(20);
        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.addCustomer(customer);

    }

    /**
     * 修改客户
     */
    public void modifyCustomer() {
        System.out.println("修改客户");

    }

    /**
     * 删除客户
     */
    public void deleteCustomer() {
        System.out.println("删除客户");
    }

    /**
     * 展示客户
     */
    public void listAllCustomer() {
        System.out.println("客户列表");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] allCustomer = customerList.getAllCustomer();
            for (int i = 0; i < allCustomer.length; i++) {
                Customer customer = allCustomer[i];
                System.out.println((i + 1 + "\t" + customer.getName() + "\t" + customer.getGender() + "\t" + customer.getAge() + "\t" + customer.getPhone() + "\t" + customer.getEmail()));
            }
            System.out.println("客户列表完成");
        }

    }


}
