package lab4;
class Bank {
    protected double balance;

    public Bank() {
        balance = 0;
    }

    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Bank {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal failed. Minimum balance of $100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank account1 = new Bank(500);
        account1.deposit(100);
        account1.withdraw(50);
        account1.withdraw(700);

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(400);
    }
}
