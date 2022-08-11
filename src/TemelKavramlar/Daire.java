package TemelKavramlar;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        int yarıcap;
        double pi=3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        yarıcap=inp.nextInt();
        double alan=pi*yarıcap*yarıcap;
        double çevre=2*pi*yarıcap;

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+çevre);

    }
}
