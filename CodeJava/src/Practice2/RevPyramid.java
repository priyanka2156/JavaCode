package Practice2;

import java.util.Scanner;

public class RevPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to be print as pyramid: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
