package code;

import java.util.Scanner;

public class DoubleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int num = sc.nextInt();
        System.out.println(num >> 1);

    }
}