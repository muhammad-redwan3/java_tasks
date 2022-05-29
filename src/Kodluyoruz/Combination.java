package Kodluyoruz;

import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number like n and r respectively to find C(n,r) and P(n,r): ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("The combination is "+ combination(n1,n2));
    }

    public static int factorial(int number) {
        int result=1;
        for(int i=1;i<=number;i++) {
            result= result *i;
        }
        return result;
    }
    public static int combination(int n, int r) {
        if(r > 0 && n >= r) {
            return (factorial(n)/(factorial(n-r)*factorial(r)));
        }
        else return 0;
    }
   
}
