package Kodluyoruz;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("enter the number :");
            a = input.nextInt();
            if (a%4==0){
                total += a;
            }
        } while (a%2==0);
        System.out.print("total = :" + total);
    }
}
