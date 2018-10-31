package pl.waw.sgh;

import java.text.NumberFormat;

public class DoubleFloat {

    public static void main(String[] args) {
        Double d1 = 3425d;
        double d2 = 34235;

        float f2 = 534636;
        //d2 = f2;
        float f1 = d1.floatValue();
        d1.intValue();
        //convertive primitive to object type
        Double d3 = Double.valueOf(d2);
        System.out.println(d1 * d2);
    }

}
