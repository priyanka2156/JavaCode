package strings;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String str = " Priyanka Kumari";

        // System.out.println(str);
        // System.out.println("hello");

        String str = "Hello";
        // int len = str.length();
        // System.out.println(str.length());

        char ch = str.charAt(3);
        // System.out.println(str.charAt(0));
        System.out.println(str.indexOf('l'));
        String gtr = "All";
        System.out.println(str.compareTo(gtr));
    }
}
