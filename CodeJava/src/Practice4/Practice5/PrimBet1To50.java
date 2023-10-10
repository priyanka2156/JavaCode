package Practice4.Practice5;

public class PrimBet1To50 {
    public static void main(String[] args) {
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The prime number betweeb 1 to 50 are " + num);
            }
        }
    }
}
