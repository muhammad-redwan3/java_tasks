package Kodluyoruz;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;
        float sum=0;
        System.out.print("N number enter:");
        n =input.nextInt();

        for (i =1;  i<=n ;  i++)
        {
            sum+=(float) 1/i;

        }

        System.out.print(sum);


    }
}
