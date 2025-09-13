package com.dexterv;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book testBook = new Book("Auto add book on startup", "Test Constructor",2025, "1236-4asd-23-09122025");
        books.add(testBook);

        showMain();

        int choice = scanner.nextInt();
        System.out.println("You choose "+ choice);
        scanner.nextLine();

        addBook();

        showBooks();
    }

    private static void showMain(){
        System.out.println("________ Welcome to Book Management App ________");
        System.out.println("1. Add Book");
        System.out.println("2. Update Book");
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
        String header = String.format("%-30s %-20s %-5s %-20s", "Title", "Author",  "Year", "ISBN");
        String separator = String.format("%-30s %-20s %-5s %-20s", "------------------------------", "--------------------", "-----", "--------------------");
        System.out.println(header);
        System.out.println(separator);

        if(books.isEmpty()){
            System.out.println("No books in your library.");
            return;
        }

        for(Book book : books){
            System.out.println(book.toString());
        }
    }
}