package Practice4.Practice5;

import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0 || year % 100 != 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
