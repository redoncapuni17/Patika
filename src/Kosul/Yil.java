package Kosul;

import java.util.Scanner;

public class Yil {
    public static void main(String[] args){
        int yıl;
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        yıl=input.nextInt();

        if(yıl%4==0){
            System.out.println(yıl+" bir artık yıldır ! ");
        }
        else{
            System.out.println(yıl+" bir artık yıldır değildir ! ");
        }
    }
}
