package app;

import services.BookService;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static final BookService bookService = new BookService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> bookService.addBook(scanner);
                case 2 -> bookService.viewBooks();
                case 3 -> bookService.searchBook(scanner);
                case 4 -> bookService.updateBook(scanner);
                case 5 -> bookService.deleteBook(scanner);
                case 6 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
