package Kodluyoruz;

import java.util.Scanner;

public class BaseAccount {
    static void base()
    {
        int base, baseTemp, force;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value:");
        base= input.nextInt();
        baseTemp=base;
        System.out.print("Enter force value:");
        force=input.nextInt();

        for(int i=1;i<force;i++)
            baseTemp*=base;
        System.out.println(baseTemp);
    }
    public static void main(String[] args) {
        base();
    }

}
