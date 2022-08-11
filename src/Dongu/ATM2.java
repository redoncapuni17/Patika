package Dongu;

import java.util.Scanner;

public class ATM2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username,password;
        int right = 3;
        int balance = 3000;
        int select;
        while(right>0){System.out.print("Enter Username : ");
            username = input.nextLine();
            System.out.print("Enter Password : ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("123")) {
                System.out.println("Welcome\n");
                do {System.out.println("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgula\n" +
                            "4 - Çıkış Yap\n");
                    System.out.println("Lütfen istediğiniz seçim yapınız : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktari : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Para miktari : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Baiye Yetersiz");
                            } else {balance -= price;
                                System.out.println("Bakiye : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkılıyor...");
                            break;
                    }}while (select !=4);
            } else{right--;
                System.out.println("Yanlış Bilgiler Girdiniz...Lütfen yine deneyin");
                if(right==0){System.out.println("Hesabınız Bllok olmuştur");
                } else{
                    System.out.println("Kalan Hak : "+right+"\n");
                }
            }
        }
    }
}
