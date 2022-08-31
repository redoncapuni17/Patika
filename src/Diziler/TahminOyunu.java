package Diziler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public  static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        System.out.println(number);
        boolean isWin = false;
        boolean isWrong = false;
        while (right < 5) {
            System.out.print("Lütfen tahminizi giriniz : ");
            int selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz");
                if(isWrong){
                    System.out.println("Çok fazla hata yaptınız. Kalan hakkı : "+(5-(++right)));
                }
                else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızda düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayi : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayi girdiniz...");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz...");
            if(!isWrong){
                System.out.println("Tahminlerimiz : "+Arrays.toString(wrong));
            }
        }
        System.out.println(number);
    }
}
