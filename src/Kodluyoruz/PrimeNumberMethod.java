package Kodluyoruz;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void checkPrime()
    {
        boolean check = false;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int n= input.nextInt();

        for (int i = 2; i <= n / 2; ++i)
        {
            if (n%i==0)
            {
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println(n+" is a prime number.");
        else
            System.out.println(n+" is not a prime number.");
    }
    public static void main(String[] args) {
        checkPrime();
    }
}
