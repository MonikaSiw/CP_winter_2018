package pl.waw.sgh.shapes;

public class Shape {

    protected double parA = 0;
    protected double parB = 0;
    protected double parR = 0;

    public Shape(double parA, double parB, double parR) {
        setParams(parA, parB, parR);
    }

    public void setParams(double parA, double b, double r) {
        this.parA = parA;
        this.parB = b;
        this.parR = r;
    }

    public void setParB(double parB) {
        this.parB = parB;
    }


    public double calculateSurface() {
        return -100;
    }


    public String toString() {
        if(this.parR==0) {
            return getClass().getSimpleName() + "(side a equals " + this.parA +
                    "), and the surface is: " + calculateSurface();
        } else {
            return getClass().getSimpleName() + "(radius equals " + this.parR +
                    "), and the surface is: " + calculateSurface();
        }
    }

}