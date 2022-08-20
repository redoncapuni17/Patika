package Dongu;

import java.util.Scanner;

public class MukemelSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,toplam=0;
        System.out.print("Bir sayi giriniz : ");
        int number = input.nextInt();

        for(i = 1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
                toplam +=i;
            }
        }
        System.out.println("Toplam : "+toplam);
        if(toplam==number){
            System.out.println(number +" Mükemmel sayidir");
        }
        else{
            System.out.println(number +" Mükemmel sayi değildir");
        }

    }
}
