package Learn;

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Palindrome number ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        if (n == rev) {
            System.out.println(n + " " + " Palindrome number ");
        } else {
            System.out.println(n + " " + "Not a Palindrome");
        }
    }
}
