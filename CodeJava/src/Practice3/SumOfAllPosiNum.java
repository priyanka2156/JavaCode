package Practice3;

public class SumOfAllPosiNum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, -4, 5, -6, 19, 30 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 0) {
                sum += num;
            }
        }

        System.out.println("Sum of positive number is: " + sum);
        // using for each loop
        // for (int num : arr) {
        // if (num > 0) {
        // sum += num;
        // }
        // }
        // System.out.println("Sum of positive numbers: " + sum);
    }
}
