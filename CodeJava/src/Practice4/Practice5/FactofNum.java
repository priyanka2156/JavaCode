package Practice4.Practice5;

public class FactofNum {
    public static void main(String[] args) {
        int num = 5, fact = 1, i = 1;
        while (i <= num) {
            fact = fact * i;
            i = i + 1;
        }
        System.err.println("The factorial of number is " + fact);
    }
}
