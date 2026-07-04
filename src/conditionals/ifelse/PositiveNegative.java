package conditionals.ifelse;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // 1.Check if a number is positive or negative.
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        sc.close();
    }
}
