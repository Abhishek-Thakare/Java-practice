package conditionals.ifelse;

import java.util.Scanner;

public class DivisibiltyCheck {
    public static void main(String[] args){
        //Check if a number is divisible by both 3 and 5.
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number : ");
        n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("yes ,its divisible by both");
        }else {
            System.out.println("not divisible");
        }
        sc.close();
    }
}
