package Practice4.Practice5;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number for multiplication: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.err.println(num + " * " + i + " = " + num * i);
        }
    }
}
