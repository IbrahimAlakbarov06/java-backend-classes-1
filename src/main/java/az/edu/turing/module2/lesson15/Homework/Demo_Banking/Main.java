package az.edu.turing.module2.lesson15.Homework.Demo_Banking;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new SavingsAccount("Messi", 1000, 1234, 1, 1);
        accounts[1] = new SavingsAccount("Messi1", 2000, 2345, 2, 1);
        accounts[2] = new CurrentAccount("Messi2", 3000, 3456, 300);
        accounts[3] = new CurrentAccount("Messi3", 4000, 4, 500);
        accounts[4] = new BankAccount("Messi4", 5000, 5);

        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println();
        }

        System.out.println("Testing transfers:");
        accounts[4].transfer(accounts[0], 200);
        accounts[2].transfer(accounts[1], 300);


        accounts[2].withdraw(400);
        accounts[3].withdraw(600);
    }
}

