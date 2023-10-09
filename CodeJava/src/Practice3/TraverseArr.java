package Practice3;

public class TraverseArr {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Traverasal array is: " + arr[i]);

        }
        // for reversing the same array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("The Traverasal array in reverse order is : " + arr[i]);
        }
        // using while loop for reversing
        // int index = arr.length - 1;
        // while (index >= 0) {
        // System.out.println(arr[index]);
        // index--;
        // }

        // using while loop for traversing
        // int index = 0;
        // while (index < arr.length) {
        // System.out.println(arr[index]);
        // index++;
        // }

    }
}
