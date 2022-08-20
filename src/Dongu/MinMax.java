package Dongu;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minValue=1,maxValue=1;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n1 =input.nextInt();

        for(int i=1;i<=n1;i++){
            System.out.print(i+". Sayiyi giriniz : ");
            int sayi=input.nextInt();
            if(sayi>maxValue){
                maxValue=sayi;
            }
            if(sayi<minValue){
                minValue=sayi;
            }
        }
        System.out.println("En büyük sayi giriniz : "+maxValue);
        System.out.println("En küçük sayi giriniz : "+minValue);
    }
}
