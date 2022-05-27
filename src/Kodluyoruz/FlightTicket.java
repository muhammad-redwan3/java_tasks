package Kodluyoruz;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, trip;
        double Discount = 0,normal_tutar ,ageDiscount ,DisAmount ,total ,Distrip ;

        System.out.print("Enter your mileage : ");
        km = input.nextInt();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        System.out.println("Choose the type of ticket : \n1-Tek Yön\n2-Gidiş-Dönüş");
        trip = input.nextInt();


        normal_tutar = (km * 0.10);

        if (age >= 0 && km >=0) {
            if (age < 12) {
                Discount = 0.50;
            } else if (age <= 24) {
                Discount = 0.10;
            } else if (age >= 65) {
                Discount = 0.30;
            }
            ageDiscount = (normal_tutar * Discount);
            DisAmount = (normal_tutar - ageDiscount);
            Distrip = (DisAmount * 0.20);
            total = ((DisAmount - Distrip)*2);

            if (trip == 1) {
                System.out.println("Bilet fiyatı : " + DisAmount + " TL");
            } else if (trip == 2) {
                System.out.print("Bilet fiyatı : " + total + " TL");
            } else {
                System.out.print("just 1 or 2 select. Try again.");
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz !.");
        }
    }
}
