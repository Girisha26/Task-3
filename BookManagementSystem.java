package com.java.Task3;

import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    boolean isavailable;

    public int getBookID() {
        return bookID;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    Book(int bookID, String title, String author, boolean isavailable){
        this.bookID=bookID;
        this.title = title;
        this.author=author;
        this.isavailable=isavailable;

    }
}
class Library {
    int currentSize;
    int size;

    Book[] book = new Book[size];

    public Library(int size) {
        this.currentSize = 0;
        this.book = new Book[size];

    }


    public void addBook(Book book) {
        if (currentSize < 5) {
            this.book[currentSize] = book;
            currentSize++;
            System.out.println("com.java.Task3.Book added successfully.");
            System.out.println();
        } else {
            System.out.println("com.java.Task3.Library is full so cannot add more books.");
            System.out.println();
        }
    }

    public void removeBook(int bookID) {

        for (int i = 0; i < currentSize; i++) {
            if (book[i].getBookID() == bookID) {
                book[i] = null;
                System.out.println("com.java.Task3.Book removed successfully.");
                System.out.println();
                return;
            }
        }
        System.out.println("com.java.Task3.Book not found.");
        System.out.println();
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < currentSize; i++) {
            if (book[i].getBookID() == bookID) {
                return book[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < currentSize; i++) {
            if(book[i] != null){

            System.out.println("BookID : " + book[i].getBookID());
            System.out.println("Title : " + book[i].getTitle());
            System.out.println("Author : " + book[i].getAuthor());}
            else{
                System.out.println("No books to display");
                System.out.println();
            }
        }
    }
}
public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(5);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println();
            System.out.println("1. Add com.java.Task3.Book");
            System.out.println("2. Remove com.java.Task3.Book");
            System.out.println("3. Search com.java.Task3.Book");
            System.out.println("4. Display Books");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();



            switch (choice) {

                case 1:
                    System.out.println();
                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author, true));
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter book ID to remove: ");
                    int removeID = sc.nextInt();
                    library.removeBook(removeID);
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter book ID to search: ");
                    int searchID = sc.nextInt();
                    Book foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("com.java.Task3.Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
                    } else {
                        System.out.println("com.java.Task3.Book not found.");
                    }
                    break;
                case 4:
                    System.out.println();
                    library.displayBooks();
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please enter a number from the menu.");
            }
        }while (choice != 0) ;

        sc.close();
    }}
