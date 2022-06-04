package MinesweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayin tarlasina hosgeldiniz !");
        System.out.println("lutfen oynemk istediginiz boyutlari gir !");
        System.out.print("satir sayisi = ");
        int row = input.nextInt();
        System.out.print("sutun sayisi = ");
        int col = input.nextInt();
        MineSweeper mayin = new MineSweeper(row, col);
        mayin.run();
    }
}
