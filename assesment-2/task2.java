
class Account {

    public double calculateYearlyCharge() {
        return 0;
    }
}

class SavingsAccount extends Account {
    double interestRate;
    double balance = 1000;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateYearlyCharge() {
        return balance * interestRate;
    }
}

class CurrentAccount extends Account {
    double transactionFee;
    int transactions = 50;

    public CurrentAccount(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateYearlyCharge() {
        return transactionFee * transactions;
    }
}

public class task2 {
    public static void main(String[] args) {

        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount(0.08);
        accounts[1] = new CurrentAccount(3.0);

        System.out.println("Yearly Interest(Savings Account): " + accounts[0].calculateYearlyCharge());
        System.out.println("Yearly Transaction Fee(Current Account): " + accounts[1].calculateYearlyCharge());
    }
}
