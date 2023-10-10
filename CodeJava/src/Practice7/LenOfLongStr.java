package Practice7;

public class LenOfLongStr {
    public static void main(String[] args) {
        String[] str = { "Apple", "Mango", "Leetche", "Cherry", "Orange" };
        int maxLen = 0;
        for (int i = 0; i < str.length; i++) {
            int length = str[i].length();
            if (length > maxLen) {
                maxLen = length;
            }
        }
        System.out.println("Length of the longest string: " + maxLen);
    }
}
