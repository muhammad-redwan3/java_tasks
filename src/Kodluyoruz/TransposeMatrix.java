package Kodluyoruz;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int r =2, c = 3;
        Scanner input = new Scanner(System.in);
        int[][] matris = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%d. satir %d. sutun elementini giriniz:",i+1,j+1);
                matris[i][j]= input.nextInt();
            }
        }

        System.out.println("Girilen 2 boyutlu dizi:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze edilen 2 boyutlu dizi:");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(matris[j][i]+" ");
            }
            System.out.println();
        }
    }
}
