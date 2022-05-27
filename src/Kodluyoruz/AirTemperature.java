package Kodluyoruz;

import java.util.Scanner;

public class AirTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        } else if (heat < 15) {
            System.out.println("Sinema gidebilirsiniz.");
        } if ((heat >= 15) && (heat <= 25)) {
            System.out.println("Piknik gidebilirsiniz.");
        } else if (heat >= 25) {
            System.out.print("Yüzme gidebilirsiniz.");
        }

    }
}
