package OOPS.Inheritance;

import java.util.Scanner;

class Person {

    void displayName(Scanner sc) {
        String name;
        name=sc.nextLine();
        System.out.println("Name: " + name);

    }
}

public class Student extends Person {
    void displayRollNo(Scanner sc) {
        int rollNo;
        rollNo=sc.nextInt();
        System.out.println("rollNo: " + rollNo);

    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Student ob = new Student();

        ob.displayName(sc);
        ob.displayRollNo(sc);
    }
}
