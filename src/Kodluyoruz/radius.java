package Kodluyoruz;

import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        double r, alan, pi = 3.14, cevre ,a ,circlePieceArea;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the diameter of the circle = ");
        r = input.nextDouble();

        alan = Math.pow(r, 2) * pi;
        System.out.println("Circle Area is : " + alan);
        cevre = 2 * pi * r;
        System.out.println("Çevre Formülü : " + cevre);

        System.out.print("enter input center angle = ");
        a = input.nextDouble();

        circlePieceArea  = (pi * (Math.pow(r, 2) * a)) / 360;
        System.out.println("Daire Alanının Parçası : " + circlePieceArea);
    }
}
