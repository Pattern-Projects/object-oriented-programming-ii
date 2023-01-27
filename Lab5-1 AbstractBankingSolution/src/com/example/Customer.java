package com.example;

public class Customer {

    private String firstName;
    private String lastName;
    private Account[] accounts;// now Account refs
    private int numberOfAccounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new Account[10]; // an Array object created which contains Account refs 
                                    // which are all initially null i.e. we are not creating an
                                    // Account object here (cant instantiate an abstract class)
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {// now an Account ref
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int account_index) {
        return accounts[account_index];
    }
}