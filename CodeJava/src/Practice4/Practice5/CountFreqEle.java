package Practice4.Practice5;

import java.util.HashMap;
import java.util.Map;

public class CountFreqEle {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 5, 9, 7, 7, 1, 4, 5 };
        int[] visitedArr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visitedArr[j] = visited;
                }
            }
            if (visitedArr[i] != visited) {
                visitedArr[i] = count;
            }
        }
        for (int i = 0; i < visitedArr.length; i++) {
            if (visitedArr[i] == visited) {
                System.out.println("frequency of" + arr[i] + visitedArr);
            }
        }
    }
}

// HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

// for (int i = 0; i < arr.length; i++) {
// if (hm.containsKey(arr[i])) {
// hm.put(arr[i], hm.get(arr[i] + 1));

// } else {
// hm.put(arr[i], 1);
// }
// }
// for (Map.Entry entry : hm.entrySet()) {
// System.out.println("Element | frequency");
// System.out.println(entry.getKey() + " " + entry.getValue());
