package guvitask;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double balance) {a
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

}

