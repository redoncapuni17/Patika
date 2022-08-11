package Dongu;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username,password;
        int right = 3;
        int balance = 1500;
        int select;
        while(right>0){
            System.out.print("Enter Username : ");
            username=input.nextLine();
            System.out.print("Enter Password : ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("123")){
                System.out.println("Welcome");
                do{
                    System.out.println("\n1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgula\n" +
                            "4 - Çıkış Yap\n");
                    System.out.println("Lütfen yapmak istediginiz seçim yapınız ? ");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.println("Para miktari : ");
                        int price = input.nextInt();
                        balance +=price;
                        System.out.println(balance);
                    }
                    else if(select == 2){
                        System.out.println("Para miktari : ");
                        int price = input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiye Yetersiz...");
                        }
                        else{
                            balance -=price;
                            System.out.println(balance);
                        }
                    }
                    else if(select == 3){
                        System.out.println("Bakiyeniz : "+balance);
                    }
                }while (select !=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }
            else{
                right--;
                System.out.println("Yanlış Bilgiler Girdiniz");
                if(right == 0){
                    System.out.println("Hesabınız Bllok Olmuştur");
                }
                else{
                    System.out.println("Kalan Hak : "+right);
                }
            }
        }
    }
}
