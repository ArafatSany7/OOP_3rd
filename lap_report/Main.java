import java.util.Scanner;

class BankAccount {
    private String accNum;
    private String accName;
    private double bal;

    public double getBalance() {
        return bal;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited $" + amt);
        } else {
            System.out.println("Deposit must be positive!");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && bal >= amt) {
            bal -= amt;
            System.out.println("Withdrew $" + amt);
        } else {
            System.out.println("Withdrawal failed! Check amount or balance.");
        }
    }

    public void setAccNum(String num) {
        accNum = num;
    }

    public void setAccName(String name) {
        accName = name;
    }

    public void setBalance(double b) {
        if (b >= 0) {
            bal = b;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        acc.setAccNum("123ABC");
        acc.setAccName("Leo");
        acc.setBalance(100);

        System.out.println("Current Balance: $" + acc.getBalance());

        System.out.print("Enter amount to deposit: ");
        double depAmt = sc.nextDouble();
        acc.deposit(depAmt);
        System.out.println("Balance after deposit: $" + acc.getBalance());

        System.out.print("Enter amount to withdraw: ");
        double wdAmt = sc.nextDouble();
        acc.withdraw(wdAmt);
        System.out.println("Balance after withdrawal: $" + acc.getBalance());

    }
}
