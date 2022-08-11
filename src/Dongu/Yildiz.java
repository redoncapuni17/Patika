package Dongu;

import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number =input.nextInt();

        for(int i=0;i<=number;i++){
            for(int j=0;j<=(number-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=(2*i);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=number;i>=0;i--){
            for(int j=(number-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int k =(2*i);k>=0;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
