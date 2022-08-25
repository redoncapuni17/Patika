package Siniflar.BoxOyunu;

public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Redon",10,120,100,100);
        Fighter f2 = new Fighter("Berian",20,85,85,0);

        Ring ring = new Ring(f1,f2,85,100);
        ring.run();
    }
}
