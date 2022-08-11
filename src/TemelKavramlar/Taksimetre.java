package TemelKavramlar;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        int km;
        double perkm=2.20,total=10;
        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km=inp.nextInt();

        total += (km * perkm);
        total=(total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : "+total);
    }
}
