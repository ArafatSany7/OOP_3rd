
import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        double withdrawAmount = 0;

        try {

            System.out.print("Enter your account balance: ");
            balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            withdrawAmount = sc.nextDouble();

            if (withdrawAmount <= 0) {
                throw new InvalidAmountException("Invalid withdrawal amount!");
            }

            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException("Insufficient funds!");
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful! Remaining balance: $" + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }

    }
}
