package Kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input= new Scanner(System.in);
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println("Array order from least = "+Arrays.toString(list));

        System.out.print("enter the number from array = ");
        int n = input.nextInt();
        for(int i : list){
            if(i>n){
                System.out.println("The big and the closest number: " +i);
                System.out.println("The small and the cloesest number: " + list[Arrays.binarySearch(list,i) - 1]);
                break;
            }
        }
    }
}
