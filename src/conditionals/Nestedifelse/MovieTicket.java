package conditionals.Nestedifelse;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//| Age          | Ticket Price |
//| ------------ | ------------ |
//| Below 5      | Free         |
//| 5–12         | ₹100         |
//| 13–59        | ₹200         |
//| 60 and above | ₹150         |
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        if(age<5){
            System.out.println("price of the ticket =free");
        } else if (age>=5 && age<=12) {
            System.out.println("pice is: 100");
        } else if (age>=13 && age<=59) {
            System.out.println("price is : 200");
        }else if(age>=60){
            System.out.println("price is: 150");
        }
        sc.close();
    }
}
