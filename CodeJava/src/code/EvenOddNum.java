package code;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " " + "The Number is Even Number ");
        } else {
            System.out.println("The Number is odd");
        }
    }
}
