package conditionals.Nestedif;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args){
        //1.Check if a person is eligible to vote.
        //
        //If age ≥ 18
        //Check if they have a voter ID.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        System.out.print("Do you have a voter ID: ");
        boolean Voterid=sc.nextBoolean();


        if(age>=18){
            if(Voterid){
                 System.out.println("You are eligibile to vote");
            }else{
                System.out.println("You need voter id to vote");
            }
        }else {
            System.out.println("NOT ELIGIBLE TO VOTE");
        }
    }
}
