package pl.waw.sgh;

public class Blocks {
    //the widest visibility - everywhere
    // public static int i0 = 5;
    // for static variables behaves like public
    // protected static int i0 = 5;
    // no visibility operator  - package wide visibility
    static int i0 = 5;
    // only within the class
    //private static int i0=5;

    static final String MY_CONSTANT = "some text";  //capital letters for constant - final - cannot be changed

    public static void main(String[] args) {
        int i1 = 0;
        System.out.println(MY_CONSTANT);
        // MY_CONSTANT = "dgghd";
        System.out.println("inside a block i0= " + i0);
        {
            System.out.println("inside a block i1= " + i1);
            int i2 = 5;
            System.out.println("inside a block i2= " + i2);
            {
                int i3 = 7;
                System.out.println("inside a block i1= " + i1);
            }
            {
                // System.out.println("inside internal block i1= " +i1);
            }

        }
        System.out.println("inside a block i1= " + i1);
        //i2 not visible in the public block
        //System.out.println("inside a block i2= " + i2);
    }
}
