package az.edu.turing.module2.lesson15.Homework.Demo_Banking;

public class SavingsAccount extends BankAccount {
    private double monthlyInterestRate;
    private int withdrawalLimit;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate, int withdrawalLimit) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalLimit = 3;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);
        System.out.println("Withdrawals: " + withdrawalLimit);
    }

    @Override
    public void withdraw(double amount){
        if (withdrawalLimit>0 && getBalance()>amount){
            setBalance(getBalance() - amount);
            withdrawalLimit--;
            System.out.println("Amount: $" + amount);
            System.out.println("New balance: $" + getBalance());
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public void applyInterest(){
        if (monthlyInterestRate>0){
            double interestAmount = getBalance()* monthlyInterestRate;
            setBalance(getBalance()+interestAmount);
            System.out.print("New balance is: "+getBalance());
        }
    }

}
