package Dongu;

import java.util.Scanner;

public class Tek {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a number : ");
            sayi=input.nextInt();
            if(sayi%2==0 || sayi%4==0){
                toplam = toplam+sayi;
            }
        }while (sayi%2==0);
        System.out.println("Toplam : "+toplam);
    }
}
