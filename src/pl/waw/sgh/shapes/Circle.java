package pl.waw.sgh.shapes;

public class Circle extends Shape {

     public Circle(double parR) {
            super(0,0, parR);
        }

        public double calculateSurface() {
            return Math.PI * Math.pow(parR,2);
        }

}
