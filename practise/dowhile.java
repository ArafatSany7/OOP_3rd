
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for factorial: ");
        double num = sc.nextInt();
        double fac = 1;

        do {

            fac *= num;
            num--;

        } while (num > 0);

        System.out.println(fac);
    }
}
