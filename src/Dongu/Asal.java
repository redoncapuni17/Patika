package Dongu;

import java.util.Scanner;

public class Asal {
    public static void main(String[] args){
        int number,toplam=0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(int i = 1;i<=10;i++){
            toplam=number*i;
            System.out.println(number+" x "+i+" = "+toplam);
        }
    }
}
