package Practice3;

public class SumAvg {
    public static void main(String[] args) {
        // Average and sum of two numbers
        // int n1 = 20, n2 = 30;
        // int sum = n1 + n2;
        // int avg = sum / 2;
        // System.out.println(sum + " " + avg);

        // Average and sum of numbers in an array

        int[] arr = { 2, 3, 4, 6, 7 };
        int sum = 0, avg;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(sum + " " + avg);
    }
}
