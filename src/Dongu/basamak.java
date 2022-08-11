package Dongu;

import java.util.Scanner;

public class basamak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int num = input.nextInt();
        int adet = 0,total=0;

        while(num != 0)
        {
            total +=  (num%10);
            num /= 10;
            ++adet;
        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplamı: " + total);
    }
}
