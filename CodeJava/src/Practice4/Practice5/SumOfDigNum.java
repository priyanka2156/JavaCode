package Practice4.Practice5;

public class SumOfDigNum {
    public static void main(String[] args) {
        int num = 123456, sum = 0;

        // Take the absolute value of num if case of negative value
        num = Math.abs(num);

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits is " + sum);
    }
}
