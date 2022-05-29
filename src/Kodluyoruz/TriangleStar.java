package Kodluyoruz;

import java.util.Scanner;

public class TriangleStar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the number of lines: ");
            n = input.nextInt();
        }
        while( n<=0 || n%2==0 );

        for (int i=1; i<=n; i++)
        {
            if(i<=n/2)
            {
                for (int k=1; k<(n/2)-i+2; k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j=1; j<(i*2)-1; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for (int k=1; k<i-(n/2); k++)
                {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int j=1; j<=(n*2)-(i*2); j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
