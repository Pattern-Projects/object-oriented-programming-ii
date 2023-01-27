package com.example;

public abstract class Account {
    
    protected double balance;// moved here from TimeDepositAccount, now its 'protected'
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {// moved here from TimeDepositAccount
        return balance;
    }
    
    public void deposit(double amount) {// moved here from TimeDepositAccount
        balance += amount;
    }
    
    @Override
    public String toString() {// moved here from TimeDepositAccount
        return getDescription() + ": current balance is " + balance;
    }
    
    public abstract boolean withdraw(double amount);// implemented in TimeDepositAccount
    
    public abstract String getDescription();// implemented in TimeDepositAccount
    
}