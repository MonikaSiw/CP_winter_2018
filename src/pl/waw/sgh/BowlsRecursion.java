package pl.waw.sgh;

import java.util.Scanner;

public class BowlsRecursion {

    public static int sum(int parA, int parB) {
        int sum = parA + parB;
        return sum;
    }


    public static int sumBowls(int row) {
        if (row == 1) return 1;
        else return sumBowls(row - 1) + row;
    }



    public static void main(String[] args) {
        /*
        int a ,b;
        System.out.print("Podaj ile wynosi a: ");
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        System.out.print("Podaj ile wynosi b: ");
        Scanner Z=new Scanner(System.in);
        b=Z.nextInt();
        */
        int a = 3;
        int b = 5;


        System.out.println("sum is: " + sum(a, b));
        System.out.println("Bowls in row 5: " + sumBowls(5));
    }
}
