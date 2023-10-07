package Learn.Practice1;

public class Reverse {
    public static void main(String[] args) {
        int[] n = { 4, 7, 1, 8, 9, 13, 3, 17, 12, 20, 19 };

        System.out.print("Reverse oder:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }

    }
}
