package Learn.Practice1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  year");
        int yr = sc.nextInt();
        if (yr % 4 == 0 || yr % 100 == 0 || yr % 400 == 0) {
            System.out.println(yr + " " + " is a leap year");
        } else {
            System.out.println(yr + " " + " is not a leap year");
        }
    }
}
