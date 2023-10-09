package Practice4.Practice5;

public class LargEle {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 9, 12, 23 };
        int larg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }
        System.out.println("The Largest element in an array is :" + max);
    }
}
