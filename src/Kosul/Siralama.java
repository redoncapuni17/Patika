package Kosul;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("First Number : ");
        a=input.nextInt();
        System.out.println("Second Number : ");
        b=input.nextInt();
        System.out.println("Third Number : ");
        c=input.nextInt();
        if((c>b) && (c>a)){
            if(a>b){
                System.out.println("b<a<c");
            }else{
                System.out.println("a<b<c");
            }
        }else if((b>a)&& (b>c)){
            if(a>c){
                System.out.println("c<a<b");
            }else{
                System.out.println("a<c<b");
            }
        }else if((a>b)&& (a>c)){
            if(b>c){
                System.out.println("c<b<a");
            }else{
                System.out.println("b<c<a");
            }
        }
    }
}
