package pl.waw.sgh.shapes;

public class PlayWithTriangle {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(2);
        // System.out.println("Circle 1 surface: " + c1.calculateSurface());
        System.out.println("1st " + t1.toString());

        Triangle t2 = new Triangle(3);
        // System.out.println("Circle 2 surface: " + c2.calculateSurface());
        System.out.println("2nd " + t2.toString());

        System.out.println("3rd: " + new Triangle(8));

    }
}
