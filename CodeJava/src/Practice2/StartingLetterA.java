package Practice2;

public class StartingLetterA {
    public static void main(String[] args) {
        String[] str = { "Vaman", "bimal", "Avni", "priyanka", "Anna" };
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) == 'A' || str[i].charAt(0) == 'a') {
                System.out.println(str[i]);
            }
        }
    }
}
