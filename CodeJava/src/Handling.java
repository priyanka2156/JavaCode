class Handling {
    public static void main(String[] args) {
        try {
            System.out.println("Learn Java");
            int a = 20, b = 0, c;
            c = a / b;
            System.out.println(c);
            System.out.println("Learn Coding");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } finally {
            System.out.println("Hello");
        }
        System.out.println("Main method ended");
    }
}
