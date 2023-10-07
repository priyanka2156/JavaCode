package code;

import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the leap year");
        int n = sc.nextInt();

        if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) {
            System.out.println(n + " " + " is leap year");
        } else {
            System.out.println(n + " " + "Year is not leap");
        }
    }

}
