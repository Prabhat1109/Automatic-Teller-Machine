package com.prabhat;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Customer Name
    // Customer Account Number
    // Customer Email
    // Customer Amount or Balance
    // Customer Phone Number
    // User Can Deposit Money,User Can WithDraw Money
        Account myAccount  = new Account("12345678","Prabhat Kumar Yadav" ,"9098429788","prabhat@gmail.com",250000.99 );
        myAccount.withDrawMoney(10000);
        myAccount.depositMoney(600000);
    }
}
