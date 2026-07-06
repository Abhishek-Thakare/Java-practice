package OOPS;

import java.util.Scanner;

public class Student {
    //Q1. Create a Student class and print details.

     String name;
     int rollno;

     void details(){
         System.out.println(name);
         System.out.println(rollno);
     }
 public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     Student ob=new Student();
     System.out.println("Enter student name: ");
     ob.name=sc.nextLine();
     System.out.println("Enter student roll no: ");
     ob.rollno=sc.nextInt();

      ob.details();
    }
}
