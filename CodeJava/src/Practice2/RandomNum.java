package Practice2;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Random randomno = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the random numbers");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(randomno.nextInt());
        }
    }
}
