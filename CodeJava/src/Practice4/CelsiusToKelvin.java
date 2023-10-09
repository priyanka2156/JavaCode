package Practice4;

import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println(" Enter the temperature to be convert ");
        float cel = sc.nextInt();
        float kelvin = (float) (cel + 273.15);
        System.out.println("The reading form celsius to kelvin is " + kelvin);

    }
}
