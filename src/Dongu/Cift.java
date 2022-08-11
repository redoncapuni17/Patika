package Dongu;

import java.util.Scanner;

public class Cift {
    public static void main(String[] args) {
        int total = 0,adet=0,number;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                adet++;
                System.out.println(adet+ ".adet -> "+i);
                total =total+i;
            }
        }
        System.out.println("Total number : "+total);
        ortalama = total/adet;
        System.out.println(total+"/"+adet);
        System.out.println("Ortalama : "+ortalama);
    }
}