package Practice3;

import java.util.Scanner;

public class SwapVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print(" Enter the second number: ");
        int n2 = sc.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping the numbers are " + n1 + " " + n2);

    }
}
