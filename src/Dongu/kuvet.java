package Dongu;

import java.util.Scanner;

public class kuvet {
    public static void main(String[] args){
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        sayi=input.nextInt();
        for(int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int k=1;k<=sayi;k*=5){
            System.out.println(k);
        }
    }
}
