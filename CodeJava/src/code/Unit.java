package code;

import java.util.Scanner;

public class Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit of meter");
        int n = sc.nextInt();
        int price = 0;

        if (n <= 80) {
            price = 0;
        } else if (n > 80 && n <= 200) {
            price = (n - 80) * 20;
        } else if (n > 200) {
            price = (120 * 20) * ((n - 200) * 50);
        } else {
            System.out.println("Invalid");
        }
        System.out.println("The total cost to pay is:" + price);

    }
}
