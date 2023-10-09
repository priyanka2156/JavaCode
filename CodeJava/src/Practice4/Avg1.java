package Practice4;

public class Avg1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0, avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;
        System.out.println("The sum of numbers is " + sum);
        System.out.println("The average of numbers is " + avg);

        // System.out.println("The average of numbers is " + avg);
        // int n1 = 40, n2 = 90;
        // int sum = n1 + n2;
        // int avg = sum / 2;
        // System.out.println("The sum of numbers is " + sum);
        // System.out.println("The average of numbers is " + avg);
    }
}