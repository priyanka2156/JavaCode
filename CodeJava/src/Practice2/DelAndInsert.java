package Practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class DelAndInsert {
    public static void main(String[] args) {

        int[] arr = new int[] { 5, 2, 11, 3, 14, 15, 12, 3, 4, 12 };
        int[] arr_new = new int[arr.length - 1];
        int j = 3;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != j) {
                arr_new[k] = arr[i];
                k++;
            }
        }
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(5, 2, 11, 3, 14, 15, 12, 3, 4, 12));
        int position = 4;
        ArrayList<Integer> elementsToInsert = new ArrayList<>(Arrays.asList(7, 11));
        originalList.addAll(position, elementsToInsert);

        System.out.println("Original List:" + originalList);
    }
}
