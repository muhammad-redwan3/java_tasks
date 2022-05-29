package Kodluyoruz;

import java.util.Scanner;

public class Pattern {
     static void pattern(int a, int b, boolean check)
    {
        int stat;
        System.out.print(b+"  ");
        if(b<1)
            check=false;
        stat=check ? (b-5):(b+5);
        if(stat<=a)
            pattern(a,stat,check);
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number =");
        num= input.nextInt();
        if(num<1)
        {
            System.out.println(" 0 veya negatif olmaz .");
            main(null);
        }
        else
            pattern(num, num, true);
    }
}
