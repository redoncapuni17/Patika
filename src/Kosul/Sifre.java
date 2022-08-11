package Kosul;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args){
        String username,password;
        Scanner inp=new Scanner(System.in);
        System.out.println("Kulancı Adı : ");
        username=inp.nextLine();
        System.out.println("Şifre : ");
        password=inp.nextLine();

        if(username.equals("Redon") && password.equals("123")){
            System.out.println("Giriş Yaptınız");
        }
        else if(username.equals("Redon") && !password.equals("123")){
            System.out.println("Şifreyi yanlış girdiniz.\nŞifreyi değiştirmek istiyor musunuz ? ");
            String cevap=inp.nextLine();
            if(cevap.equals("Evet")){
                System.out.println("Yeni şifre giriniz : ");
                String cevap1=inp.nextLine();
                if(cevap1.equals("123")){
                    System.out.println("Şifre Oluşturmadı, Lütfen Başka Bir Şifre Giriniz");
                }
                else{
                    System.out.println("Şifre Oluşturdu");
                }
            }
            else if(cevap.equals("Hayır")){
                System.out.println("Şifre değiştirlimiyor...");
            }
        }
    }
}
