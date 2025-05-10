//Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.
class QnoTwo {
    String accountHolderName;
    String accountNumber;
    double balance;

    public QnoTwo(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrl.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Qn2_medium {
    public static void main(String[] args) {
        QnoTwo account1 = new QnoTwo("Aashish Shrestha", "12345", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayAccountInfo();
        QnoTwo account2 = new QnoTwo("Lionel Messi", "67890", 2000);
        account2.deposit(1000);
        account2.withdraw(3000);
        account2.displayAccountInfo();
    }
}