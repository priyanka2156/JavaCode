package Practice3;

public class CompoundInt {
    public static void main(String[] args) {
        int p = 3000;
        int r = 5;
        int n = 5;
        int CI;
        CI = p * (1 + r / 100) * n - p;
        System.out.println("The compound interest is: " + CI);
    }
}
