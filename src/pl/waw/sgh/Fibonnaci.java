package pl.waw.sgh;


import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {

      //  int n=20;
        int n;
        System.out.print("Podaj, ile wyrazów ciągu Fibonacciego program ma wyświetlić: ");
        Scanner S = new Scanner(System.in);
        n = S.nextInt();

        int x1=0;
        int x2=1;
        int f=0;

        for ( int i=0;i<n; i++ ){
            if(i<=1) {
                System.out.println(i);
            } else {

                f=x1+x2;
                System.out.println(f);
                if(i%2==0) {
                    x1=f;
                } else {
                    x2=f;
                }

            }

        }
    }
}
