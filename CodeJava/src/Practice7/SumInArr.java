package Practice7;

public class SumInArr {
    public static void main(String[] args) {
        int[] num = { 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
