package Kodluyoruz;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {

        int n , k , total = 1 , i;
        Scanner input = new Scanner(System.in);

        System.out.print("Number to base : ");
        n = input.nextInt();

        System.out.print("number to be exponent : ");
        k = input.nextInt();

        for(i=1; i<=k; i++){
            total *= n;
        }
        System.out.println("total : "+total);
    }
}
