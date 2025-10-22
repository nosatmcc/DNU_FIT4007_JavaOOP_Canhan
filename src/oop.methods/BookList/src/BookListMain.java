import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Book #" + (i + 1));
            Book b = new Book();
            b.input();
            books.add(b);
        }

        System.out.println("\nAll books:");
        books.forEach(System.out::println);

        double maxPrice = books.stream().mapToDouble(Book::getPrice).max().orElse(0);
        System.out.println("\nBooks with max price:");
        books.stream().filter(b -> b.getPrice() == maxPrice).forEach(System.out::println);

        System.out.println("\nBooks named 'Java OOP':");
        books.stream().filter(b -> b.getName().equalsIgnoreCase("Java OOP")).forEach(System.out::println);

        System.out.println("\nSorted by quantity ascending:");
        books.stream().sorted(Comparator.comparingInt(Book::getQuantity)).forEach(System.out::println);

        System.out.println("\nSorted by price descending:");
        books.stream().sorted((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice())).forEach(System.out::println);
    }
}
