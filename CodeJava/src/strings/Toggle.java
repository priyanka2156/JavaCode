package strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println(str);

        // toggle
        // PHysics->phYSIcs
        for (int i = 0; i < str.length() - 1; i++) {
            // P -> p
            // check -> alphabet -small,capital
            boolean flag = true; // true->capital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97)
                flag = false; // small
            if (flag == true) { // capital
                ascii += 32;
                char dh = (char) ascii;// a
                str.setCharAt(i, dh);
            } else { // small
                ascii -= 32;
                char dh = (char) ascii;
                str.setCharAt(i, dh);

            }
        }
        System.out.println(str);
    }
}
