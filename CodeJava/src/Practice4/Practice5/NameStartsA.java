package Practice4.Practice5;

public class NameStartsA {
    public static void main(String[] args) {
        String[] str = { "Bimal", "Komal", "simran", "Avni", "Amit", "ani" };

        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) == 'A' || str[i].charAt(0) == 'a') {
                System.out.println(str[i]);
            }
        }
    }
}
