package Practice7;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the prime number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
