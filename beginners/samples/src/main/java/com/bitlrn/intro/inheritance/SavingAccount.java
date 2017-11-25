/*
 * Copyright (c) 2017 Bitlrn Inc.
 * All rights reserved.
 */

package com.bitlrn.intro.inheritance;


final public class SavingAccount extends Account {

    public SavingAccount(long accountId,String name, double initBalance) {
        super(accountId, name, initBalance);
        System.out.println("Savings Account: Account Id:"+this.accountId +
            " Account Name:"+this.name+
            " Account balance:"+balance);
    }
}
