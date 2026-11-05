package Labs.lab08;

public class Account {
    int id;
    String owner;
    double balance;

    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    void Deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative!");
        }
        balance += amount;
    }

    void Withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public void getDetails() {
        System.out.println("Account " + id + "\nOwner: " + owner + "\nBalance: " + balance);
    }

    public void AddInterest() {
        balance += balance*0.025;
    }

}
