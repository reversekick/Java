
package com.bitlrn.intro.inheritance;

import java.util.Scanner;

public class AccountManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of account you want to create? Enter 1. Savings 2. Checkings:");
        int input = scanner.nextInt();
        Account account = null;
        if(input >2 || input < 1){
            System.out.println("Enter proper account type! ");
            return;
        }

        System.out.println("Enter account id:");
        long accId = scanner.nextLong();
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter inital Balance:");
        double balance = scanner.nextDouble();
        if(input == 1) {
            account = new SavingAccount(accId, name, balance);
        }else if(input == 2){
            account = new CheckingAccount(accId, name, balance);
        }

        account.deposit(50.0);
        account.withdraw(25.0);

        account.displayBalance();

    }
}

