import java.util.Scanner;

class Book {
    String isbn;
    String title;
    double price;

    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("ISBN: " + isbn + ", Title: " + title + ", Price: $" + price);
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");

            System.out.print("ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(isbn, title, price);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.display();
        }

    }
}
