package Practice6;

import java.util.Scanner;

public class IfEvenOrOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an Even number ");
        } else {
            System.out.println(num + " is a odd number ");
        }
    }
}
