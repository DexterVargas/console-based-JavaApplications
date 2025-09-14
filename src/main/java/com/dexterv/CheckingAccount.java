package com.dexterv;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = 10.00;
        if ((amount + fee) <= balance) {
            balance -= (amount + fee);
            System.out.println("Withdrawn: ₱" + super.numberFormat(amount) + " (₱10 fee applied)");
        } else {
            System.out.println("Insufficient funds!");
        }

    }

    @Override
    public String toString() {
        String savingBalance = "₱" + numberFormat(this.balance);
        return String.format("%-30s %-20s %-10s %-20s", super.getName(), super.getAccountNumber(), savingBalance, "Checking");
    }
}
