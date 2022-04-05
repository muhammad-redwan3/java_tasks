package Kodluyoruz;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        int math, physical, chemical, Turkish,History, music;
        final int count = 6;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your math grade: ");
        math = input.nextInt();

        System.out.print("Enter your physical grade: ");
        physical = input.nextInt();

        System.out.print("Enter your chemical grade: ");
        chemical = input.nextInt();

        System.out.print("Enter your Turkish grade: ");
        Turkish = input.nextInt();

        System.out.print("Enter your History grade: ");
        History = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        int sum = (math + physical + chemical + Turkish + History + music);
        double result = sum/count;
        System.out.println("result: "+result);
        String ortalama = result >= 60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("sonuc : " + ortalama);
    }
}
