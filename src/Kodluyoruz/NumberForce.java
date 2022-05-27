package Kodluyoruz;

import java.util.Scanner;

public class NumberForce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, a;
        System.out.print("enter the number:");
        number= input.nextInt();

        System.out.print("sayisina kadar olan 4'un kuvvetleri:");
        for(a=1; a<number; a=a*4)
        {
            System.out.printf("\n%d",a);
        }

        System.out.print("\nsayisina kadar olan 5'in kuvvetleri:");
        for(a=1; a<number;a= a*5)
        {
            System.out.printf("\n%d",a);
        }
    }
}
