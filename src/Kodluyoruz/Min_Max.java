package Kodluyoruz;

import java.util.Scanner;

public class Min_Max {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Kac tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int max=0 , min=0;
        for (int i=1; i<=n; i++)
        {
            System.out.print(i+". sayiyi giriniz: ");
            int sayi = input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max){
                max=sayi;
            }
            if (sayi<min){
                min=sayi;
            }
        }
        System.out.println("the max number: "+max);
        System.out.println("the min number: "+min);
    }
}
