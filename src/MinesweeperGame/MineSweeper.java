package MinesweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row_number ,col_number, size;
     char[][] map;
     char[][] board;
     boolean game = true;

    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    MineSweeper(int row_number, int col_number)
    {
        this.row_number = row_number;
        this.col_number = col_number;
        this.map = new char[row_number][col_number];
        this.board = new char[row_number][col_number];
        this.size = row_number*col_number;
    }
    public void run()
    {
        int row , col , success=0;
        perpareGame();
        print(map);
        System.out.println("oyun basladi");
        while (game){
            print(board);
            System.out.print("satir sayisi = ");
             row = in.nextInt();
            System.out.print("sutun sayisi = ");
             col = in.nextInt();
             if (row <0 || row >= row_number){
                 System.out.println("Gecersiz koordinat");
                 continue;
             }
            if (col <0 || col >= col_number){
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (map[row][col] != '*'){
                check(row ,col);
                success++;
                if (success == (size - (size/4))){
                    System.out.print("Basardiniz !");
                    break;
                }
            }else {
                game = false;
                System.out.print("Game over!");
            }
        }

    }
    public void perpareGame()
    {
        int randRow,randCol, count =0;

        while (count != (size/4))
        {
            randRow = rand.nextInt(row_number);
            randCol = rand.nextInt(col_number);
            if (map[randRow][randCol] != '*'){
                map[randRow][randCol] = '*';
                count++;
            }
        }
    }

    public void print(char[][] arr)
    {
        for (char[] chars : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" ");
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }

    public void check(int r , int c){
        if (map[r][c] == 0){
            if (  (c < col_number -1)  && (map[r][c+1]=='*') ){
                board[r][c]++;
            }
             if ((r < row_number -3) && (map[r+1][c]=='*')){
                board[r][c]++;
            }
            if ((r >0 )       &&         (map[r-1][c]  ==  '*' )){
                board[r][c]++;
            }
            if ( (c > 0 ) &&  (map[r][c-1]  ==  '*') ){
                board[r][c]++;
            }
            if (board[r][c] == 0){
                board[r][c] = ' ';
            }
        }

    }
//public static boolean isValidIndex(char[][] arr, int row, int column) {
//    return row >= 0 && row < arr.length && column >= 0 && column < arr[0].length ;
//}
//
//    public boolean check(int row,int column){
//
//        if(row < 0 || row >= map.length || column < 0 || column >= map[0].length){
//            System.out.println("Dizinin boyutlarını aştınız");
//            return false;
//        }
//        if(opened == map.length * map[0].length - map.length*map[0].length/4 -1){
//            System.out.println("Oyunu Kazandınız !");
//            return false;
//        }
//        if(map[row][column] == '*'){
//            System.out.println("Mayına bastınız !");
//            return false;
//        }
//
//        //counting numbers of bomb around the cell
//        int count = 0;
//        for(int i = row - 1; i < row + 2; i++ ){
//            for(int j = column - 1; j < column + 2; j++ ){
//                if(isValidIndex(map, i, j)){
//                    if(map[i][j] == '*'){
//                        count++;
//                    }
//                }
//            }
//        }
//
//        //conversion of int to char
//        int a = count;
//        char b = (char)(a + '0');
//
//        //counting opened cell
//        if(board[row][column] !=b){
//            board[row][column] = b;
//            opened++;
//        }
//        print(board);
//        System.out.println("===================================================");
//        return true;
//    }


}
