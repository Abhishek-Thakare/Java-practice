package OOPS.classes_objects;

import java.util.Scanner;

public class Book {

    int bookId;
    String title;
    String author;
    boolean isIssued;

    void input(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("\nBook issued successfully.");
        } else {
            System.out.println("\nBook is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("\nBook returned successfully.");
        } else {
            System.out.println("\nBook is already available.");
        }
    }

    void displayDetails() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Book Status  : " + (isIssued ? "Issued" : "Available"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Book ob = new Book();

        ob.input(sc);
        ob.displayDetails();

        System.out.println("\nIssuing Book...");
        ob.issueBook();
        ob.displayDetails();

        System.out.println("\nReturning Book...");
        ob.returnBook();
        ob.displayDetails();

        sc.close();
    }
}