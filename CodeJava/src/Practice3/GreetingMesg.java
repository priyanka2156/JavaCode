package Practice3;

import java.util.Scanner;

public class GreetingMesg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the name: ");
        String name = sc.nextLine();
        System.out.println(" Enter the age: ");
        int age = sc.nextInt();

        System.out.println(" Have a good day " + name + " " + age);
    }
}
