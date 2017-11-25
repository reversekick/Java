
/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.inheritance;


abstract public class Account {
    protected final long accountId;
    protected final String name;
    protected double balance;

    protected Account(long accountId, String name, double initBalance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = initBalance;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Please deposit an amount > 0");
        }
        balance += amount;
        System.out.println(amount + " deposited to account with id "+ this.accountId);
    }

    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Please withdraw amount > 0");
        }
        balance -= amount;
        System.out.println(amount + " withdraw from account with id "+ this.accountId);
    }

    public void displayBalance (){
        System.out.println("The balance in account with id "+ accountId + " with name "+name
                            + " is "+ balance);
    }
}
