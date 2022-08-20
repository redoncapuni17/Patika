package Dongu;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args){
        int number,a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Eleman sayısı: ");
        number = input.nextInt();
        a = 0;
        b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < number; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}

