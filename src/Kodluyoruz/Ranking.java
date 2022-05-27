package Kodluyoruz;

import java.util.Scanner;

public class Ranking {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter the a number : ");
        a = inp.nextInt();
        System.out.print("Enter the b number : ");
        b = inp.nextInt();
        System.out.print("Enter the c number : ");
        c = inp.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            } else {
                System.out.print("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.print("c < a < b");
            } else {
                System.out.print("c < b < a");
            }
        }
    }
}
