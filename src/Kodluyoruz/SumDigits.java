package Kodluyoruz;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number: ");
        
        int num = input.nextInt();

        int adet = 0, total=0;

        while(num != 0)
        {
            total=(num%10)+total;
            num /= 10;
            ++adet;
        }

        System.out.println("Digit Total = " + total);
    }
}
