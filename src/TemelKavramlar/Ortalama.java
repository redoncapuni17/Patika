package TemelKavramlar;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args){
        Scanner ders= new Scanner(System.in);
        System.out.print("Matematik notunuz giriniz : ");
        int mat = ders.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        int fizik=ders.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        int kimya=ders.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        int türkçe= ders.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        int tarih=ders.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        int music = ders.nextInt();
        ders.nextLine();
        double ortalama = (mat+fizik+kimya+türkçe+tarih+music)/6;
        System.out.println("\nOrtalama : "+ortalama);
        if (ortalama>=60){
            System.out.println("Sınıfı Geçti");
        }
        else{
            System.out.println("Sınıfı Kaldı");
        }

    }
}
