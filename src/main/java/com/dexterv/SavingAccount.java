package com.dexterv;

public class SavingAccount extends Account {

    public SavingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    @Override
    public void deposit(double amount) {
        double interest = amount * 0.02;
        super.deposit(amount +  interest);
        System.out.println("Savings Account : interest earned ₱" + super.numberFormat(interest));

    }
    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₱" + super.numberFormat(amount));
        } else {
            System.out.println("Insufficient funds.");
        }

        super.printBalance();
    }

    @Override
    public String toString() {
        String savingBalance = "₱" + numberFormat(this.balance);
        return String.format("%-30s %-20s %-10s %-20s", super.getName(), super.getAccountNumber(), savingBalance, "Savings");
    }
}
