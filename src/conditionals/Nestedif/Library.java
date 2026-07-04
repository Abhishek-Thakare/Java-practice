package conditionals.Nestedif;

import java.util.Scanner;

public class Library {
    //5.//A person wants to borrow a book.
    //Conditions
    //Check if the person has a library membership.
    //If yes, check whether they have any overdue books.
    //Print:
    //Book Issued
    //Return Overdue Books First
    //Membership Required
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String book=sc.nextLine();
        System.out.println("Do you have a Library membership: ");
        boolean LibMem=sc.nextBoolean();

        if(LibMem){
            System.out.print("Do you have any overdue books? (true/false): ");
            boolean overdue = sc.nextBoolean();
            if(overdue){
                System.out.println("Return Overdue Books First");
            }else{
                System.out.println("Book Issued: " + book);
            }
        }else {
            System.out.println("Membership Required");
        }
    }
}
