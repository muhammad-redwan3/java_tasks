package Kodluyoruz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b = 1, sonuc = 0;
        System.out.print("enter the number= ");
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            a = b;
            b = sonuc;
            sonuc = a + b;
            System.out.print(sonuc +" ");
        }
    }
}
