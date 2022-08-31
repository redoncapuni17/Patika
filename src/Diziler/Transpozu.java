package Diziler;

import java.util.Scanner;

public class Transpozu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Matris kaç satırlı : ");
        int a = input.nextInt();
        System.out.print("Matris kaç kolonlu : ");
        int b = input.nextInt();
        System.out.println("Matris elemanları sırasıyla giriniz : ");

        int[][] matris = new int[a][b];
        for(int i = 0;i < matris.length;i++){
            for(int  j = 0;j < matris[i].length;j++){
                matris[i][j]=input.nextInt();
            }
        }
        for(int i = 0 ;i<matris.length;i++){
            for(int j = 0;j<matris.length;j++){
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------");
        System.out.println("Matrisin Transpozu ");
        for(int j = 0;j<matris[0].length;j++){
            for(int i = 0;i<matris.length;i++){
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
