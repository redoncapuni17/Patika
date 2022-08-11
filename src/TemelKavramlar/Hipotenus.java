package TemelKavramlar;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        int a,b;
        double c;
        Scanner inp=new Scanner(System.in);
        System.out.print("1.Kenarı giriniz : ");
        a=inp.nextInt();
        System.out.print("2.Kenarı giriniz : ");
        b=inp.nextInt();
        System.out.print("3.Kenarı giriniz : ");
        c=inp.nextInt();
        inp.nextLine();

        double u=(a+b+c)/2;
        double alan;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan : "+alan);

    }
}
