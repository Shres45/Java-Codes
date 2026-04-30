abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(double balance, int accountNumber, String name, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = name;
        this.address = address;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double balance, int accNo, String name, String address, double roi) {
        super(balance, accNo, name, address);
        this.rateOfInterest = roi;
    }

    void withdrawal(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        double amount = balance + (balance * rateOfInterest / 100);
        System.out.println("Amount after Interest = " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10000, 101, "John", "Delhi", 5);

        s.deposit(2000);
        s.withdrawal(1000);
        s.display();
        s.calculateAmount();
    }
}