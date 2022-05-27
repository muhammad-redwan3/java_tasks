package Kodluyoruz;

import java.util.Scanner;

public class ClassStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turkce, fizik, kimya, muzik;
        int number = 5;
        double average;

        System.out.println("Lütfen notlarınızı 0-100 arasında olacak şekilde giriniz.");
        System.out.print(" enter a note in Maths : ");
        mat = input.nextInt();
        System.out.print("enter a note in Turkish: ");
        turkce = input.nextInt();
        System.out.print("enter a note in physics: ");
        fizik = input.nextInt();
        System.out.print("enter a note in chemical : ");
        kimya = input.nextInt();
        System.out.print("enter a note in music : ");
        muzik = input.nextInt();

        if (!(mat <= 100 && mat >= 0)){
            number--; mat = 0;
            System.out.println(" You entered an incorrect value for Maths. do not join the average.");
        }
        if (!(turkce <= 100 && turkce >= 0)) {
            number--; turkce = 0;
            System.out.println("You entered an incorrect value for Turkish. do not join the average.");
        }
        if (!(fizik <= 100 && fizik >= 0)) {
            number--; fizik = 0;
            System.out.println("You entered an incorrect value for physics.do not join the average.");
        }
        if (!(kimya <= 100 && kimya >= 0)){
            number--; kimya = 0;
            System.out.println("You entered an incorrect value for chemical. do not join the average.");
        }
        if (!(muzik <= 100 && muzik >= 0)) {
            number--; muzik = 0;
            System.out.println("You entered an incorrect value for music");
        }

        if (number == 0) {
            System.out.println("The values you entered are incorrect. Re-enter your notes.");
        } else {
            average = (mat + turkce + fizik + kimya + muzik) / number;
            if (average <= 55) {
                System.out.println("you failed the class.");
            } else {
                System.out.println("You have successfully completed the class.");
            }
            System.out.print("your average : " + average);
        }
    }
}
