// 85 is biggest.
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Print Book Information");
            System.out.println("4. Show All Books"); 
            System.out.println("5. Show Book Count");
            System.out.println("6. Exit");
            System.out.print("Please select an option (1-6): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1: // Add Book
                    String title;
                    String author;
                    int page;
                    String description;
                    double price;
                    Type type;

                    System.out.print("Book Title: ");
                    title = scanner.nextLine();
                    System.out.print("Author: ");
                    author = scanner.nextLine();

                    // Loop for page number
                    while (true) {
                        System.out.print("Number of Pages: ");
                        try {
                            page = Integer.parseInt(scanner.nextLine());
                            if (page < 0) {
                                System.out.println("Number of pages cannot be negative.");
                            } else {
                                break; // Exit loop if a valid value is obtained
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid integer.");
                        }
                    }

                    // Loop for price
                    while (true) {
                        System.out.print("Price ($): ");
                        try {
                            price = Double.parseDouble(scanner.nextLine());
                            if (price < 0) {
                                System.out.println("Price cannot be negative.");
                            } else {
                                break; // Exit loop if a valid value is obtained
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid decimal number.");
                        }
                    }

                    // Get description
                    System.out.print("Description: ");
                    description = scanner.nextLine();

                    // Loop for book type
                    while (true) {
                        System.out.print("Book Type (NOVEL, CLASSIC, CHILD, BIOGRAPHY, MYSTERY, SELFHELP, HISTORY): ");
                        String typeInput = scanner.nextLine().toUpperCase();
                        try {
                            type = Type.valueOf(typeInput);
                            break; // Exit loop if a valid type is obtained
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid book type. Please enter the correct type.");
                        }
                    }

                    Book newBook = new Book(title, author, page, description, price, type);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2: // Remove Book
                    System.out.print("Title of the Book to Remove: ");
                    String titleToRemove = scanner.nextLine();
                    ArrayList<Book> booksToRemove = new ArrayList<>();

                    // Find books with the same title
                    for (Book book : library.books) {
                        if (book.getTitle().equalsIgnoreCase(titleToRemove)) {
                            booksToRemove.add(book);
                        }
                    }

                    if (booksToRemove.isEmpty()) {
                        System.out.println("Book not found.");
                    } else {
                        // List found books
                        System.out.println("Found Books:");
                        for (int i = 0; i < booksToRemove.size(); i++) {
                            Book book = booksToRemove.get(i);
                            System.out.println((i + 1) + ". " + book.getTitle() + " - " + book.getAuthor() + " - " + book.getPage() + " Pages");
                        }

                        System.out.print("Enter the number of the book you want to remove: ");
                        int bookIndex;
                        while (true) {
                            try {
                                bookIndex = Integer.parseInt(scanner.nextLine()) - 1; // Convert from 1-based to 0-based
                                if (bookIndex >= 0 && bookIndex < booksToRemove.size()) {
                                    break; // Exit loop if a valid value is obtained
                                } else {
                                    System.out.println("Invalid number. Please try again.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please enter a valid integer.");
                            }
                        }

                        // Remove the selected book
                        Book bookToRemove = booksToRemove.get(bookIndex);
                        library.removeBook(bookToRemove);
                        System.out.println("Book removed successfully.");
                    }
                    break;

                case 3: // Print Book Information
                    System.out.print("Title of the Book to View: ");
                    String titleToPrint = scanner.nextLine();
                    ArrayList<Book> booksToPrint = new ArrayList<>();

                    // Find books with the same title
                    for (Book book : library.books) {
                        if (book.getTitle().equalsIgnoreCase(titleToPrint)) {
                            booksToPrint.add(book);
                        }
                    }

                    if (booksToPrint.isEmpty()) {
                        System.out.println("Book not found.");
                    } else {
                        // List found books
                        System.out.println("Found Books:");
                        for (int i = 0; i < booksToPrint.size(); i++) {
                            Book book = booksToPrint.get(i);
                            System.out.println((i + 1) + ". " + book.getTitle() + " - " + book.getAuthor() + " - " + book.getPage() + " Pages");
                        }

                        System.out.print("Enter the number of the book you want to view: ");
                        int bookIndex;
                        while (true) {
                            try {
                                bookIndex = Integer.parseInt(scanner.nextLine()) - 1; // Convert from 1-based to 0-based
                                if (bookIndex >= 0 && bookIndex < booksToPrint.size()) {
                                    break; // Exit loop if a valid value is obtained
                                } else {
                                    System.out.println("Invalid number. Please try again.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please enter a valid integer.");
                            }
                        }

                        // Print the information of the selected book
                        Book bookToPrint = booksToPrint.get(bookIndex);
                        library.printBookInfo(bookToPrint);
                    }
                    break;

                case 4: // Show All Books
                    if (library.books.isEmpty()) {
                        System.out.println("The library is empty.");
                    } else {
                        System.out.println("Books in the Library:");
                        for (Book book : library.books) {
                            System.out.println("- " + book.getTitle() + " - " + book.getAuthor() + " - " + book.getPage() + " Pages - " + book.getPrice() + " $ - Type: " + book.getType());
                        }
                    }
                    break;

                case 5: // Show Book Count
                    System.out.println("Total Book Count: " + Book.getBookcount());
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}
