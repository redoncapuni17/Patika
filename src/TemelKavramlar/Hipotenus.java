package TemelKavramlar;

import java.util.*;
import java.io.*;

class Main {

    public static int FirstFactorial(int num) {
        int fact = 1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}