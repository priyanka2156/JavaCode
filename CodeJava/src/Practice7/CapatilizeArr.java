package Practice7;

public class CapatilizeArr {
    public static void main(String[] args) {
        String[] str = { "mona", "riya", "monti", "jack" };
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toUpperCase();
            System.out.println(" The array of name after capitilize " + str[i]);
        }
    }
}
