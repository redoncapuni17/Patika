package TemelKavramlar;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args){
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble();
        if(tutar>=0 && tutar<=1000){
            double kdvOran = 0.18;
            double kdvTutar=tutar * kdvOran;
            double kdvliTutar=tutar * kdvTutar;

            System.out.println("KDV'siz Tutar : "+tutar);
            System.out.println("KDV Oranı : "+kdvOran);
            System.out.println("KDV Tutarı : "+kdvTutar);
            System.out.println("KDV'li Tutarı : "+kdvliTutar);
        }
        else{
            double kdvOran = 0.08;
            double kdvTutar=tutar * kdvOran;
            double kdvliTutar=tutar * kdvTutar;

            System.out.println("KDV'siz Tutar : "+tutar);
            System.out.println("KDV Oranı : "+kdvOran);
            System.out.println("KDV Tutarı : "+kdvTutar);
            System.out.println("KDV'li Tutarı : "+kdvliTutar);
        }

    }
}
