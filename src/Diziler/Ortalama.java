package Diziler;

public class Ortalama {
    public static void main(String[] args){
        int[] list ={2,5,9,8,6};
        double total = 0;
        for(double i: list){
            total +=1/i;
        }
        double ortalama = list.length/total;
        System.out.println("Eleman Sayisi : "+ortalama);
    }
}