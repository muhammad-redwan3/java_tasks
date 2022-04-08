package Kodluyoruz;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double Armut = 2.14 , Elma = 3.67 , Domates = 1.11 , Muz = 0.95, Patlican = 5 , total =0;
        double ArmutK , ElmaK  , DomatesK , MuzK , PatlicanK ;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?: ");
        ArmutK = input.nextDouble();

        System.out.print("Elma Kaç Kilo ?: ");
        ElmaK = input.nextDouble();

        System.out.print("Domates Kaç Kilo ?: ");
        DomatesK = input.nextDouble();

        System.out.print("Muz Kaç Kilo ?: ");
        MuzK = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?: ");
        PatlicanK = input.nextDouble();

        total+=( (ArmutK*Armut) + (ElmaK*Elma)+(DomatesK*Domates)+(MuzK*Muz)+(PatlicanK*Patlican));

        System.out.println("Toplam Tutar : "+ total);


    }
}
