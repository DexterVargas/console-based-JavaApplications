package com.dexterv;

import java.text.DecimalFormat;

public class Account {
    private String name;
    private String accountNumber;
    protected double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(this.name + " deposited: ₱" + numberFormat(amount));

        printBalance();
    }

    public void withdraw(double amount){}

    public String numberFormat(double amount){
        DecimalFormat df = new DecimalFormat("###,###,###.##");
        return df.format(amount);
    }

    public void printBalance(){

        String savingBalance = "Current Account Balance: ₱" + numberFormat(this.balance);

        System.out.println(savingBalance);
    }

    @Override
    public String toString() {

        String savingBalance = "₱" + numberFormat(this.balance);

        return String.format("%-30s %-20s %-10s %-20s", name, accountNumber, savingBalance, "");
    }
}
