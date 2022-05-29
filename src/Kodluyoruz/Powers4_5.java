package Kodluyoruz;

import java.util.Scanner;

public class Powers4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , i;

        System.out.print("enter the number: ");
        n = input.nextInt();

        System.out.println("Girdiginiz "+n+" sayisina kadar olan 4'un kuvvetleri:");

        for(i=1;i<n;i=i*4)
        {
            System.out.println(i);
        }

        System.out.println("\nGirdiginiz "+n+" sayisina kadar olan 5'in kuvvetleri:");
        for(i=1;i<n;i=i*5)
        {
            System.out.println(i);
        }
    }
}
