package conditionals.Nestedif;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //3.ATM withdrawal
        //If balance is enough
        //Check if amount is a multiple of 100.
        System.out.println("Total bank balance: ");
        int balance=sc.nextInt();
        System.out.println("Enter the withdrawal amount: ");
        int withdrawal=sc.nextInt();
        if(withdrawal<balance){
            if(withdrawal%100==0){
                System.out.println("Withdrawal the amount from bank");
            }else{
                System.out.println("Invalid amount");
            }
        }else{
            System.out.println("Insufficent amount");
        }
    }
}
