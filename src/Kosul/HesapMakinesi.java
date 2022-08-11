package Kosul;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        int n1,n2,select;

        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        n1=inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2=inp.nextInt();

        System.out.print("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiniz : ");
        select=inp.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplama : "+(n1 + n2));
                break;
            case 2:
                System.out.print("Çıkartma : "+(n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma : "+(n1 * n2));
                break;
            case 4:
                System.out.print("Bölme : "+(n1 / n2));
                break;
        }

    }
}
