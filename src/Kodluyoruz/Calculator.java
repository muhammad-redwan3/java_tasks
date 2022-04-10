package Kodluyoruz;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        double num1,num2;
        System.out.print("Enter first number = ");
        num1 = inp.nextDouble();
        System.out.print("Enter second number = ");
        num2 = inp.nextDouble();
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose) {
            case 1 -> System.out.println(add(num1, num2));
            case 2 -> System.out.println(sub(num1, num2));
            case 3 -> System.out.println(mult(num1, num2));
            case 4 -> System.out.println(div(num1, num2));
            default -> System.out.println("Illigal Operation");
        }



    }
    public static double add(double x, double y)
    {
        return x + y;
    }
    public static double sub(double x, double y)
    {
        return x-y;
    }
    public static double mult(double x, double y)
    {
        return  x*y;
    }
    public static double div(double x, double y)
    {
        return x/y;
    }

}
