package Practice4;

import java.util.Scanner;

public class MinHrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minute to be convert");
        int totalmin = sc.nextInt();

        int hrs = totalmin / 60;
        int remainingmin = totalmin % 60;
        System.out.println("Hours: " + hrs);
        System.out.println("Minutes: " + remainingmin);
    }
}
