package pl.waw.sgh.shapes;

public class Triangle extends Shape {
    public Triangle(double parA) {
        super(parA,0, 0);
    }

    public double calculateSurface() {
        return 0.25 *Math.pow(parA,2) *Math.sqrt(3);
    }

}
