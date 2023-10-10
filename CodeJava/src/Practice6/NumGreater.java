package Practice6;

import java.util.Scanner;

public class NumGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num > 5) {
            System.out.println(num + " is greater than 5 ");
        } else {
            System.out.println(num + " is not greater then 5");
        }
    }

}
