package Practice3;

import java.util.Scanner;

public class YrsWeekDaysConv {
    public static void main(String[] args) {

        int years, days, week;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int m = sc.nextInt();

        years = m / 365;
        m = m % 365;
        System.out.println("Number of years : " + years);

        week = m / 7;
        m = m % 7;
        System.out.println("Number of weeks: " + week);

        days = m;
        System.out.println("Number of days: " + days);
    }

}
