package conditionals.Nestedifelse;

import java.util.Scanner;

public class IncomeTaxSlab {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Write a Java program to calculate the tax slab based on annual income.
        //Conditions
        //Income ≥ ₹10,00,000 → 30% Tax
        //Income ≥ ₹5,00,000 → 20% Tax
        //Income ≥ ₹2,50,000 → 5% Tax
        //Otherwise → No Tax
        int rate;
        double tax;
        System.out.println("Enter the income: ");
        int income=sc.nextInt();

        if(income>=1000000){
            rate=30;

        }else if(income>=500000){
            rate=20;

        }else if(income>=200000){
            rate=5;

        }else {
           rate=0;
        }
        tax=(income*rate)/100.0;
        System.out.println("Tax Rate: " + rate + "%");
        System.out.println("Tax Amount: ₹" + tax);

        sc.close();
    }
}
