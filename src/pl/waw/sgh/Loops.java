package pl.waw.sgh;

import java.sql.SQLOutput;

public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I=" + i);
        }

        for (int i = 6; i > 1; i--) {
            if (i == 5) continue;  //skip to the next iteration
            System.out.println("I=" + i);
            if (i == 4) break;  //stop the loop
        }

        int j = 0;  //typical letters: i,j,k,etc.
        while (j < 6) {
            System.out.println("J= " + j);
            j++;
        }

        System.out.println();
        int k = 6;
        do {
            System.out.println("K= " + k);
            k--;
        } while (k > 2);     //do while    will always operate at least once, it then checks it

    }
}

