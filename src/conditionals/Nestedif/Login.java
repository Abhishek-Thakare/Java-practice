package conditionals.Nestedif;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //4.Check login.
        //If username is correct
        //Check password.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (username.equals("Abhishek")) {
            if (password.equals("@1234"))
            {
                System.out.println("Login successful");
            }else{
                System.out.println("Wrong password");
            }
        }else{
            System.out.println("Invalid username");
        }

    }

}
