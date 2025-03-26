package services;

import model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();

        books.add(new Book(id, title, author, genre, availability));
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBook(Scanner scanner) {
        System.out.print("Enter Book ID or Title: ");
        String input = scanner.nextLine();

        for (Book book : books) {
            if (String.valueOf(book.getId()).equals(input) || book.getTitle().equalsIgnoreCase(input)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void updateBook(Scanner scanner) {
        System.out.print("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {
            if (book.getId() == id) {
                System.out.print("Enter new Availability (Available/Checked Out): ");
                String newAvailability = scanner.nextLine();
                book.setAvailability(newAvailability);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void deleteBook(Scanner scanner) {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        books.removeIf(book -> book.getId() == id);
        System.out.println("Book deleted successfully!");
    }
}
