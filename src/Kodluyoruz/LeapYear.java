package Kodluyoruz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("enter year : ");
        year = input.nextInt();

        if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.print(year + " bir artık yıldır.");
        } else if (year % 4 == 0) {
            System.out.print(year + " bir artık yıldır.");
        } else {
            System.out.print(year + " bir artık yıl değildir.");
        }
    }

}
