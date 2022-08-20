package Dongu;

import java.util.Scanner;

public class EBOB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1,number2;
        System.out.print("Enter the first number : ");
        number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        number2 = input.nextInt();
        int ebob=1;

        for(int i =1;i<number1;i++){

            if(number1 %i ==0 && number2 %i ==0){
                System.out.println(i);
                ebob =i;
            }
        }
        System.out.println("---------");
        for(int k=number1;k>=1;k--){
            if(number1%k==0 && number2%k==0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }


    }
}
