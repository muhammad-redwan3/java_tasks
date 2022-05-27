package Kodluyoruz;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        String UserName ,Password;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter User Name: ");
        UserName = input.nextLine();

        System.out.print("Enter your Password: ");
        Password = input.nextLine();

        if(UserName.equals("patika") && Password.equals("java123")){
            System.out.println("You are logged in successfully ! ");
        }else if(UserName.equals("patika")) {
            int select;
            String newPassword;
            System.out.println("Wrong password. Reset? ");
            System.out.print("1-Yes \n 2-no \n");
            select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1 -> {
                    System.out.print("Enter new password:");
                    newPassword = input.nextLine();
                    if (newPassword.equals(Password)) {
                        System.out.println("Failed to create password. Please enter another password.");
                    } else {
                        System.out.println("Password successfully created.");
                    }
                }
                case 2 -> System.out.println("Password Not Reset");
                default -> System.out.println("Invalid Transaction !");
            }
        }else{
            System.out.println("Your Information Is Wrong !");
        }
    }
}
