package Practice2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number fot area of circle :");
        int r = sc.nextInt();

        float area = (float) ((3.14) * r * r);
        System.out.println("The area of circle is" + " " + area);

    }
}
