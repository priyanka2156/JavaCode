package strings;

public class ToggleStr {
    public static void main(String[] args) {
        String str = "PhYsiCS";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // true->capital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97)
                flag = false; // small
            if (flag == true) { // capital
                ascii += 32;
                char dh = (char) ascii;// a
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else { // small
                ascii -= 32;
                char dh = (char) ascii;
                str = str.substring(0, i) + dh + str.substring(i + 1);

            }
        }
        System.out.println(str);
    }
}
