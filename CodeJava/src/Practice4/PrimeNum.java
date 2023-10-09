package Practice4;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the prime number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("The number is a not prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("The number is not a prime");
                return;
            }
        }
        System.out.println("The number is prime ");
    }
}
