# Simple Banking System
Build a console-based banking system that lets a user create **Savings or Checking accounts, deposit, withdraw, and view balances**.

## Features

### User can:
- Create new account (Savings or Checking)
- View all accounts
- Deposit money
- Withdraw money
- Exit program

### Accounts should have:
- Account number (String)
- Owner name (String)
- Balance (double)

### Special rules:
- Savings account earns 2% interest on every deposit
- Checking account charges ₱10 fee for each withdrawal


### MAIN
```
________ Welcome to Bankito Bank  ________
1. Open Account
2. View All Accounts
3. Deposit
4. Withdraw
5. Exit
```

### Add Account
```
Enter your choice: 1
| ************ CREATE ACCOUNT *************** |
Please enter Account Number: dex 01
Please enter the name: 111-222
Enter initial deposited Amount: 2500
Enter account type (1=Savings, 2=Checking): 
1
Account Successfully Created!


Enter your choice: 1
| ************ CREATE ACCOUNT *************** |
Please enter Account Number: test dev
Please enter the name: 333-000
Enter initial deposited Amount: 5000
Enter account type (1=Savings, 2=Checking): 
2
Account Successfully Created!

```

### View Accounts
```
************************** All ACCOUNTS ************************** 
Account Name                   Account Number       Balance    Type                
------------------------------ -------------------- ---------- --------------------
dex 01                         111-222              ₱4,030     Savings             
test dev                       333-000              ₱6,000     Checking    
```

### Deposit
```
Enter your choice: 3
Enter account number: 
111-222
Enter amount to deposit: 
1500
dex 01 deposited: ₱1,530
Current Account Balance: ₱4,030
Savings Account : interest earned ₱30

Enter your choice: 3
Enter account number: 
333-000
Enter amount to deposit: 
1000
test dev deposited: ₱1,000
Current Account Balance: ₱6,000
```

### Withdraw
```
Enter your choice: 4
Enter account number: 
111-222
Enter amount to withdraw: 
3500
Withdrawn: ₱3,500
Current Account Balance: ₱530


Enter your choice: 4
Enter account number: 
333-000
Enter amount to withdraw: 
500
Withdrawn: ₱500 (₱10 fee applied)
Current Account Balance: ₱5,490


Enter your choice: 4
Enter account number: 
111-222
Enter amount to withdraw: 
500
Insufficient funds.

```

### Exit
```
Enter your choice: 5
Exiting application...
```

### invalid choice
```
Enter your choice: asd
'asd' is not a valid. Please enter valid number
```

### Bonus Challenges (Optional)
- Add account PIN and require it for transactions
- Allow transferring between accounts
- Save accounts to file and load on startup
- Add timestamps and transaction history