package pl.waw.sgh;

public class PlayWithText {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";

        String s3 = s + s2;
        System.out.println(s + s2);

        int slen = s.length();   //s is an object ,  "." means running some method on an object

        System.out.println(s.indexOf("b"));
        System.out.println(s.charAt(2));
        System.out.println(slen);

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1, 4));
    }
}
