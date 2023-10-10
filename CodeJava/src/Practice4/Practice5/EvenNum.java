package Practice4.Practice5;

public class EvenNum {
    public static void main(String[] args) {
        int[] num = { 4, 5, 6, 8, 9, 3, 2 };

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {

                System.out.println(" The Even number is " + num[i]);
            }
        }
    }
}
