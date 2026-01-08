class Account {
    protected static int accCounter = 1000;
    protected int accNo;
    protected String name;
    protected String accType;
    protected double balance;
    protected int day, month, year;

    Account(String name, String accType, double balance, int d, int m, int y) {
        this.accNo = ++accCounter;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        this.day = d;
        this.month = m;
        this.year = y;
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
        checkBalance();
    }

    void withdraw(double amt) {
        System.out.println("Withdraw method of Account");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt + " with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded");
            return;
        }
        checkBalance();
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
            checkBalance();
        } else {
            System.out.println("Daily limit exceeded");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Account a1 = new StandardAccount("Aastha", 800000, 1, 1, 2026);
        Account a2 = new PremiumAccount("Rahul", 2000000, 2, 1, 2026);

        a1.deposit(20000);
        a1.withdraw(150000);

        a2.withdraw(500000);
    }
}
