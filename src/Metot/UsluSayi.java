package Metot;

import java.util.Scanner;

public class UsluSayi {
    static int power(int base,int exponent){
        if(base == 0 || exponent ==0){
            return 1;
        }
        return power(base,exponent-1)*base;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = input.nextInt();
        System.out.println("Sonuç : "+power(base,exponent));
    }
}
