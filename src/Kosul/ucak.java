package Kosul;

import java.util.Scanner;

public class ucak {
    public static void main(String[] args){
        int km,yaş,yolTip;
        double normalTutar,indirimTutar,yaşIndirim,toplam,tekçift;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM türünden giriniz : ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yaş = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 yada 2) : ");
        yolTip = input.nextInt();
        if(yaş<12){
            switch (yolTip){
                case 1:
                    System.out.println("Tek Yön");
                    normalTutar=km *0.10;
                    yaşIndirim=normalTutar*0.50;
                    indirimTutar=normalTutar-yaşIndirim;
                    System.out.println("Toplam : "+indirimTutar);
                    break;
                case 2:
                    System.out.println("Çift Yön");
                    normalTutar=km*0.10;
                    yaşIndirim=normalTutar*0.50;
                    indirimTutar=normalTutar-yaşIndirim;
                    tekçift=indirimTutar*0.20;
                    toplam=(indirimTutar-tekçift)*2;
                    System.out.println("Toplam : "+toplam);
                    break;
            }
        }
        else if(yaş>=12 && yaş<=24){
            switch (yolTip){
                case 1:
                    System.out.println("Tek Yön");
                    normalTutar=km *0.10;
                    yaşIndirim=normalTutar*0.10;
                    indirimTutar=normalTutar-yaşIndirim;
                    System.out.println("Toplam : "+indirimTutar);
                    break;
                case 2:
                    System.out.println("Çift Yön");
                    normalTutar=km*0.10;
                    yaşIndirim=normalTutar*0.10;
                    indirimTutar=normalTutar-yaşIndirim;
                    tekçift=indirimTutar*0.20;
                    toplam=(indirimTutar-tekçift)*2;
                    System.out.println("Toplam : "+toplam);
                    break;
            }
        }
        else if(yaş>24 && yaş<=65){
            switch (yolTip){
                case 1:
                    System.out.println("Tek Yön");
                    normalTutar=km *0.10;
                    System.out.println("Toplam : "+normalTutar);
                    break;
                case 2:
                    System.out.println("Çift Yön");
                    normalTutar=km*0.10;
                    tekçift=normalTutar*0.20;
                    toplam=tekçift*2;
                    System.out.println("Toplam : "+toplam);
                    break;
            }
        }
        else if(yaş>65){
            switch (yolTip){
                case 1:
                    System.out.println("Tek Yön");
                    normalTutar=km *0.10;
                    yaşIndirim=normalTutar*0.30;
                    indirimTutar=normalTutar-yaşIndirim;
                    System.out.println("Toplam : "+indirimTutar);
                    break;
                case 2:
                    System.out.println("Çift Yön");
                    normalTutar=km*0.10;
                    yaşIndirim=normalTutar*0.30;
                    indirimTutar=normalTutar-yaşIndirim;
                    tekçift=indirimTutar*0.20;
                    toplam=(indirimTutar-tekçift)*2;
                    System.out.println("Toplam : "+toplam);
                    break;
            }
        }
    }
}
