package Kodluyoruz;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number = ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n));
    }


    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
}
