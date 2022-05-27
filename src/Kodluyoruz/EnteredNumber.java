package Kodluyoruz;

import java.util.Scanner;

public class EnteredNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0 , number;
        double sum = 0;

        System.out.print("enter the number: ");
        number = input.nextInt();
        for (int i=0 ; i<=number ; i++){
            if(i % 3 == 0 & i % 4 == 0 ){
                sum +=i;
                k++;
                System.out.println("Girdiğiniz sayıya kadar hem 3 hem 4'e tam bölünen sayıların ortalaması: " + sum / k);
            }
        }

    }
}
