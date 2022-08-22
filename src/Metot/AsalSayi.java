package Metot;

import java.util.Scanner;

public class AsalSayi {
    static void asal(int number,int i){
        if(number == i){
            System.out.println(number+" Sayi Asaldır");
            return;
        }
        else if(number %i ==0){
            System.out.println(number+" Sayi Asal Değildir");
            return;
        }
        asal(number,i+1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int number = input.nextInt();
        asal(number,2);
    }
}
