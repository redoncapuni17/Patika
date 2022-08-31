package Oyun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give number for Line Number:  ");
        int line = input.nextInt();
        System.out.print("Give number for Column Number:  ");
        int column = input.nextInt();

        MineSweeper mine = new MineSweeper(line,column);
        mine.RUN();
    }
}
