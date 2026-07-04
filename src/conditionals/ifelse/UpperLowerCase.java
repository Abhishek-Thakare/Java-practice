package conditionals.ifelse;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args){
        //Check if a character is uppercase or lowercase.
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character: ");
        ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else {
            System.out.println("Lowercase");
        }
        sc.close();
    }
}
