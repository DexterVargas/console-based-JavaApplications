package com.dexterv;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            showMenu();
            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("e")) {
                System.out.println("Exiting Application...");
                running = false;
                continue;
            }

            try{
                switch (Integer.parseInt(choice)) {
                    case 1 -> addAccount();
                    case 2 -> viewAllAccounts();
                    case 3 -> depositMoney();
                    case 4 -> withdrawMoney();
                    case 5 -> {
                        System.out.println("Exiting application...");
                        running = false;
                    }
                    default -> System.out.println("\nInvalid choice. Try again.\n");
                }
            } catch(NumberFormatException e){
                System.out.println("'" + choice + "' is not a valid. Please enter valid number. \n");
            }
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("________ Welcome to Bankito Bank  ________");
        System.out.println("1. Open Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addAccount() {
        System.out.println("| ************ CREATE ACCOUNT *************** |");

        System.out.print("Please enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposited Amount: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter account type (1=Savings, 2=Checking): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        if(accountType == 1) {
            SavingAccount account = new SavingAccount(accountNumber, name, initialDeposit);
            accounts.add(account);
        } else if(accountType == 2) {
            CheckingAccount account = new CheckingAccount(accountNumber, name, initialDeposit);
            accounts.add(account);
        }

        System.out.println("Account Successfully Created!");

    }

    public static void viewAllAccounts() {
        System.out.println("************************** All ACCOUNTS ************************** ");
        displayInTableFormat();

        if(accounts.isEmpty()){
            System.out.println("No Account.");
            return;
        }

        for(Account account : accounts){
            System.out.println(account.toString());
        }
    }

    private static void displayInTableFormat() {
        String header = String.format("%-30s %-20s %-10s %-20s", "Account Name", "Account Number",  "Balance", "Type");
        String separator = String.format("%-30s %-20s %-10s %-20s", "------------------------------", "--------------------", "----------", "--------------------");
        System.out.println(header);
        System.out.println(separator);
    }

    private static void depositMoney() {
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account resAccount = findAccountNumber(accountNumber);

        if (resAccount == null){
            System.out.println("Account Not Found!");
            return;
        }

        System.out.println("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine();
        resAccount.deposit(deposit);

    }

    private static void withdrawMoney() {
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account resAccount = findAccountNumber(accountNumber);

        if (resAccount == null){
            System.out.println("Account Not Found!");
            return;
        }

        System.out.println("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        scanner.nextLine();
        resAccount.withdraw(withdraw);

    }

    private static Account findAccountNumber(String accountNumber) {

        for(Account account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}