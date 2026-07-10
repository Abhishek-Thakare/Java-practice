package OOPS.classes_objects;

import java.util.Scanner;

public class Rectangle {
    // Write methods to calculate and display the area and perimeter.
  int l,b;
    int area;
    int perimeter;
   void input(Scanner sc){
       l=sc.nextInt();
       b=sc.nextInt();
   }
   void area(){
       area=l*b;
   }
   void perimeter(){
       perimeter=2+(l+b);
   }
   void display(){
       System.out.println("Area of rectangle is: "+area);
       System.out.println("Perimeter of rectangle is: "+perimeter);

   }
   public static void main(String[] args){
       Rectangle ob=new Rectangle();
       Scanner sc=new Scanner(System.in);
       ob.input(sc);
       ob.area();
       ob.perimeter();
       ob.display();
   }

}
