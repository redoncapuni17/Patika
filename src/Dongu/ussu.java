package Dongu;

import java.util.Scanner;

public class ussu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,total=1;
        System.out.println("Enter the basis : ");
        sayi1=input.nextInt();
        System.out.println("Enter the exponent : ");
        sayi2 = input.nextInt();

        for(int i=1;i<=sayi2;i++){
            total *=sayi1;
        }
        System.out.println("Total : "+total);
    }
}
