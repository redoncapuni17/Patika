package TemelKavramlar;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut =2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican =5.00;

        System.out.print("Armut Kaç Kilo : ");
        int armutKilo = input.nextInt();
        System.out.print("Elma Kaç Kilo : ");
        int elmaKilo = input.nextInt();
        System.out.print("Domates Kaç Kilo : ");
        int domatesKilo = input.nextInt();
        System.out.print("Muz Kaç Kilo : ");
        int muzKilo = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo : ");
        int patlicanKilo = input.nextInt();
        double toplam = ((armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo));
        System.out.println("Toplam Tutar : "+toplam+" TL");



    }
}
