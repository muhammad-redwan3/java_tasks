package Kodluyoruz;
import java.util.Scanner;
public class Kdv {

    public static void main(String[] args) {

        double number , Kdv =0.18 ,tutari , KdvBuyuk =0.8 ,KdvTutari ;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the number = ");

        number = input.nextDouble();

        if (number >= 0 && number<=1000)
        {
            tutari = number * Kdv;
            KdvTutari = number + tutari;
            System.out.println("Kdv siz tutari = " + number);
            System.out.println("Kdv oran =" + Kdv);
            System.out.println("Kdv tutari = " + tutari);
            System.out.println("Kdv ile tutari = " + KdvTutari);

        }else if (number >1000)
        {
            tutari = number * KdvBuyuk;
            KdvTutari = number + tutari;
            System.out.println("Kdv siz tutari = " + number);
            System.out.println("Kdv oran = " + KdvBuyuk);
            System.out.println("Kdv tutari = " + tutari);
            System.out.println("Kdv ile tutari = " + KdvTutari);
        }
    }
}
