package strings;

public class ImmutableString {

    public static void main(String[] args) {
        String s1 = "Priyanka";
        System.out.println("Initial String s1 is : " + s1);
        String s2 = s1;
        System.out.println("changed String s2 is : " + s2);
        s1 = "Priyanka Kumari";

        System.out.println("Final String s2 is : " + s2);
    }
}
