package Kosul;
import java.util.Scanner;
public class SinifGecmeNotu {
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,music;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik nutunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Music notunuzu giriniz : ");
        music = input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
        }else if(fizik<0 || fizik>100){
            fizik=0;
        }else if(turkce<0 || turkce>100){
            turkce=0;
        }else if(kimya<0 || kimya>100){
            kimya=0;
        }else if(music<0 || music>100){
            music=0;
        }
        double avarage = (mat + fizik + turkce + kimya + music) / 5;
        if(avarage>=55){
            System.out.println("Ortalama : "+avarage+"\nGeçtiniz");
        }else{
            System.out.println("Ortalama : "+avarage+"\nKaldınız\nLütfen Yine Deneyin");
        }
    }
}
