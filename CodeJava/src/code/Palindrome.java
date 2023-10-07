package code;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        int i = 0;
        int j = str.length();
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Plaindrome");
    }
}
