package Dongu;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        double result =0.0;
        for(int i =1;i<=number;i++){
            result += (1.0/i);

        }
        System.out.println(result);
    }
}
