package Kodluyoruz;

import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        double Kilo , Boy, BodyMass ;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz = ");
        Boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz = ");
        Kilo = input.nextDouble();
        BodyMass = Kilo / Math.pow(Boy, 2);

        System.out.println("Vücut Kitle İndeksiniz : : " + BodyMass);

    }
}
