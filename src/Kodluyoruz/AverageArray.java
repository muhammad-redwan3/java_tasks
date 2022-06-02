package Kodluyoruz;

public class AverageArray {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        double top;
        float result = 0;
        for (int j : dizi) {
            result += 1f / j;
        }
        top= dizi.length / result;
        System.out.println("Harmonik Ortalama ="+top);
    }
}
