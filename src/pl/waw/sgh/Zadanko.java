package pl.waw.sgh;

import java.util.*;


public class Zadanko {
    public static void main(String[] args) {
        //m=number of prime numbers to print

        int m = 15;
        int b = 2;
        int x = 0;
        int a = 0;
        System.out.print("Podaj ile chcesz wyswietlic liczb: ");
        Scanner S = new Scanner(System.in);
        m = S.nextInt();
        for (int j = 1; j > 0; j++) {
            for (int i = 1; i < (b / 2); i++) {
                if ((b % i == 0) && (i != 1)) a++;
                if (a != 0) break;
            }
            if (a == 0) {
                x++;
                System.out.println(" liczba numer " + x + " to " + b);
            }
            a = 0;
            b++;
            if (x == m) break;
        }
    }

}

