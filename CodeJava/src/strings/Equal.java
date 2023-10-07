package strings;

public class Equal {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        System.err.println(s1.equals(s2));
    }
}
