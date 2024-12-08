package az.edu.turing.module2.lesson15.Homework.Demo_Banking;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder, double balance, int accountNumber){
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Amount: $" + amount);
            System.out.println("New balance: $" + getBalance());
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && balance>amount){
            balance-=amount;
            System.out.println("Amount: $" + amount);
            System.out.println("New balance: $" + getBalance());
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public void transfer(BankAccount account, double amount){
        if (amount>0 && balance> amount){
            withdraw(amount);
            account.deposit(amount);
            System.out.println("Successfully transferred " + amount + " to account: " + account.accountNumber);
        }
        System.out.println("Invalid amount");
    }
}
