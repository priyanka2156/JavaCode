package code;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                count = 1;
            }

        }
        if (count == 0) {
            System.out.println(num + " " + "Congratulation");
        } else {
            System.out.println("better luck next time");
        }

    }
}
