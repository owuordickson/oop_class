package com.classes;

public class Account {

    private String account;
    private double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails(){
        System.out.println("Account Number: " + account);
        System.out.println("Balance: " + balance);
    }

}

