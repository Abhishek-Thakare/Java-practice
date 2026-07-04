package conditionals.ifelse;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        //2.Find the greater of two numbers.
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter no a: ");
        a = sc.nextInt();
        System.out.println("Enter no b: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        sc.close();
    }
}