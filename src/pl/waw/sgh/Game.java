package pl.waw.sgh;

public class Game {
    public static void main(String[] args) {
        int n = 6;
        int x = 0;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                x++;
            }
        }
        ;
        System.out.println("x= " + x);
    }
}
