package Kodluyoruz;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        int n1, n2 ,a ,ebob = 1, i =1 ,k = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("1. number : ");
         n1 = input.nextInt();

        System.out.print("2. number: ");
         n2 = input.nextInt();

        a = Math.min(n1, n2);

        while (i <= a) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Girdiginiz iki sayinin Ebob'u: " + ebob);

        while (k <= n1 * n2) {
            k++;
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println("Girdiginiz iki sayinin EKOK'u: " + k);
                break;
            }
        }

        

    }
}