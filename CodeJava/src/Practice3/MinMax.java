package Practice3;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        // Using loop
        // int[] arr = { 5, 2, 6, 9, 8, 1 };
        // int max = arr[0];
        // int min = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // } if {
        // min = arr[i];
        // }
        // }
        // System.out.println("Maximum number is " + max);
        // System.out.println("Minimum number is " + min);

        // using collections:

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(6);
        numList.add(4);
        numList.add(5);
        numList.add(3);
        numList.add(2);
        numList.add(1);
        numList.add(9);

        int max = Collections.max(numList);
        int min = Collections.min(numList);

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
