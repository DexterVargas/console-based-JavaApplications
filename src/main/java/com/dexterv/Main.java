package com.dexterv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book testBook = new Book("Auto add book on startup", "Test Constructor",2025, "1236-4asd-23-09122025");
        books.add(testBook);

        boolean running = true;
        while (running) {
            showMain();
            String choice = scanner.nextLine();
            // Check if the input is "e" to exit the application
            if (choice.equalsIgnoreCase("e")) {
                System.out.println("Exiting application...");
                running = false;
                continue; // Skip the rest of the loop and go to the next iteration
            }
            try {

            switch (Integer.parseInt(choice)) {
                case 1 -> addBook();
                case 2 -> showBooks();
                case 3 -> removeBook();
                case 4 -> searchBooks();
                case 5 -> {
                    System.out.println("Exiting application...");
                    running = false;
                }
                default -> System.out.println("\nInvalid choice. Try again.\n");
            }
            } catch (NumberFormatException e) {
                System.out.println("'" + choice + "' is not a valid. Please enter valid number. \n");
            }
        }
        scanner.close();
    }

    private static void showMain(){
        System.out.println("________ Welcome to Book Management App ________");
        System.out.println("1. Add Book");
        System.out.println("2. Show All Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Search Book by Title");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook(){
        System.out.println("| ************ ADD NEW BOOK *************** |");
        System.out.print("Please enter the title: ");
        String title = scanner.nextLine();
        System.out.print("Please enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter the year published: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book(title, author, year, isbn);

        System.out.println("Book added successfully");
        books.add(book);
    }

    private static void showBooks(){
        System.out.println("************************** LIST OF BOOKS ************************** ");

        displayInTableFormat();

        if(books.isEmpty()){
            System.out.println("No books in your library.");
            return;
        }

        for(Book book : books){
            System.out.println(book.toString());
        }
    }

    private static void displayInTableFormat() {
        String header = String.format("%-30s %-20s %-5s %-20s", "Title", "Author",  "Year", "ISBN");
        String separator = String.format("%-30s %-20s %-5s %-20s", "------------------------------", "--------------------", "-----", "--------------------");
        System.out.println(header);
        System.out.println(separator);
    }

    private static void searchBooks(){

        System.out.print("Enter the title: ");
        String title = scanner.nextLine().toLowerCase();

        System.out.println("\n ************************** SEARCH RESULT ***************************");
        displayInTableFormat();
        boolean found = searchBookByTitle(title);


        if(!found){
            System.out.println("Title not found");
        }
    }

    private static boolean searchBookByTitle(String title){
        int counter = 0;

        ArrayList<String> bookList = new ArrayList<>();

        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(title)){
                counter++;
                bookList.add(book.toString());
            }
        }

        if(counter > 0){
            System.out.printf("%s book/s found successfully:\n",  counter);
            for(String book : bookList)
                System.out.println(book);
        }

        System.out.println("-------------------------------Search result end--------------------------------\n");
        return true;
    }

    public static void removeBook(){
        System.out.println("| ************ REMOVE a BOOK *************** |");
        System.out.print("Enter ISBN of book to remove from your library: ");
        String isbn = scanner.nextLine();
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));

        if(removed){
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found");
        }
    }
}