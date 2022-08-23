package Metot;

import java.util.Scanner;

public class Desene {
    static void desene(int n){
        if(n>0) {
            System.out.println(n);
            desene(n - 5);
        }
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n =input.nextInt();
        desene(n);
    }
}
