class LessBalanceException extends Exception {
    LessBalanceException(double amt) {
        super("Withdraw amount Rs. " + amt + "is not possible");
    }
}

public class Account {

    double balance = 0;
    double MIN_BAL = 500;

    Account() {
        balance = MIN_BAL;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited " + amt + "\nNew Balance: " + balance);
    }

    void withdraw(double amt) throws LessBalanceException {
        if (balance - amt < MIN_BAL) {
            throw new LessBalanceException(amt);
        } else {
            balance -= amt;
            System.out.println("Withdrawn " + amt + "\nNew Balance: " + balance);
        }
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account o1 = new Account();

        o1.deposit(1000);

        try {
            o1.withdraw(400);
        } catch (LessBalanceException e) {
            System.out.println("Less Balance Exception: " + e.getMessage());
        }
    }

}