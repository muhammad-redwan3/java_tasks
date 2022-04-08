package Kodluyoruz;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double a, b, c, u, alan  ,perimeter;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the edge A = ");
        a = input.nextDouble();
        System.out.print("Enter the edge B = ");
        b = input.nextDouble();
        System.out.print("Enter the edge C =  ");
        c = input.nextDouble();

        u = (a+b+c)/2;

        perimeter = u*2;
        System.out.println("ucgenin Çevresi = " + perimeter );

        alan = u*(u-a)*(u-b)*(u-c);
        System.out.print("Üçgenin Alanı = " + Math.sqrt(alan));
    }
}
