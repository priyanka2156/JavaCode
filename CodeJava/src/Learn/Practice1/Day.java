package Learn.Practice1;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of day");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.err.println("Sunday");
                break;

            case 2:
                System.err.println("Monday");
                break;
            case 3:
                System.err.println("Tuesday");
                break;
            case 4:
                System.err.println("Wednesday");
                break;
            case 5:
                System.err.println("Thursday");
                break;
            case 6:
                System.err.println("Friday");
                break;
            case 7:
                System.err.println("Saturday");
                break;

            default:
                System.out.println("Enter the valid  number please");

        }
    }
}
