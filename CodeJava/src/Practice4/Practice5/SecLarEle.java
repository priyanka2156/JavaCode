package Practice4.Practice5;

public class SecLarEle {
    public static void main(String[] args) {
        int[] num = { 3, 5, 7, 9, 8, 1, 9 };

        int larg = Integer.MIN_VALUE;
        int SecLarg = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > larg) {
                SecLarg = larg;
                larg = num[i];
            }
            if (num[i] < larg && num[i] > SecLarg) {
                SecLarg = num[i];
            }
        }
        System.out.println("The second largest element in an array is " + SecLarg);
    }
}
