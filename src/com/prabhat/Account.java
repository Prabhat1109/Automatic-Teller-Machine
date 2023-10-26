package com.prabhat;

public class Account {
    private String accountNumber;
    private String nameOfCustomer;
    private String phoneNumber;
    private String email;
    private double balance;

    public Account(String accountNumber, String nameOfCustomer, String phoneNumber, String email, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfCustomer = nameOfCustomer;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getnameOFCustomer() {
        return nameOfCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBlance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setcustomerName(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void depositMoney(double depositedMoney) {
        this.balance = this.balance + depositedMoney;
        System.out.println("Deposit Is Successful and New Balance is " + this.balance);
    }

    public void withDrawMoney(double withDrawedMoney) {
        if (this.balance - withDrawedMoney < 0) {
            System.out.println("Withdraw is unsuccessful Only " + this.balance + "amount is left");
        } else {
            this.balance = this.balance - withDrawedMoney;
            System.out.println("Money is withdraw  successfully and Current Balance of Account is " + this.balance);
        }
    }
}
