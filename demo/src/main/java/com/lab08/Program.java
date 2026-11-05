package com.lab08;

public class Program {
    public static void main(String[] args) {
        /*
        Account account = new Account(1, "Steven", 0);
        account.Deposit(500);
        account.Withdraw(100);
        account.getDetails();
        */
        /*
        Account myAccount = new Account(1, "Steven", 100);
        myAccount.AddInterest();
        myAccount.getDetails();

        Account partnerAccount = myAccount;
        partnerAccount.AddInterest();
        myAccount.getDetails();
        */
        /*
        Account myAccount = new Account(1, "Steven", 100);
        processAccount(myAccount);
        myAccount.getDetails();
        */

        int k = 100;
        incInt(k);
        System.out.println(k);

    }

    static void processAccount(Account acc) {
        acc.AddInterest();
    }

    private static void incInt(int x) {
        x++;
    }
}
