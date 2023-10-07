package code;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1;

        System.out.println("Enter how many fibonacci number to print");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(n1 + " " + n2);
        // for (int i = 2; i < n; i++) {
        // int sum = n1 + n2;
        // n1 = n2;
        // n2 = sum;
        // System.out.print(" " + sum);
        int i = 1;
        while (i < n) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(" " + sum);
            i++;
        }
    }
}
