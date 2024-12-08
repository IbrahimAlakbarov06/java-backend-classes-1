package az.edu.turing.module2.lesson15.Homework.Demo_Banking;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Amount: $" + amount);
            System.out.println("New balance: $" + getBalance());
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }

}
