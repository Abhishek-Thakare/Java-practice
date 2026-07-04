package conditionals.Nestedif;

import java.util.Scanner;

public class MarksCheck {
    public static void main(String[] args){
    //2.Check if a student passed.
        //If marks ≥ 35
        //Check if marks ≥ 75 (Distinction).
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks of student: ");
      int marks =sc.nextInt();
      if(marks>=35){
          if(marks>=75){
              System.out.println("Student passed with distinction");
          }else{
              System.out.println("Student got passed");
          }
      }else{
          System.out.println("Failed");
      }
    }
}
