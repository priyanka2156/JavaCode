package Practice4;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();

        str = str.toLowerCase();
        String s = "";

        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                s = s + i;
            }
        }
        if (s.length() == 26) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is not a pangram");
        }
    }
}
