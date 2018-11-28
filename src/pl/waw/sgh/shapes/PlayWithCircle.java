package pl.waw.sgh.shapes;

public class PlayWithCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
       // System.out.println("Circle 1 surface: " + c1.calculateSurface());
        System.out.println("1st " + c1.toString());

        Circle c2 = new Circle(3);
       // System.out.println("Circle 2 surface: " + c2.calculateSurface());
        System.out.println("2nd " + c2.toString());

        System.out.println("3rd: " + new Circle(7));

    }
}
