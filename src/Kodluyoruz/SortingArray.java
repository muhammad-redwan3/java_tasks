package Kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter arr length: ");
            n = input.nextInt();
        }
        while (n <= 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nTotal number of items: " + arr.length);

        Arrays.sort(arr);

        System.out.println("Sorting Elements in an Array =");
        System.out.print(Arrays.toString(arr));
    }
}
