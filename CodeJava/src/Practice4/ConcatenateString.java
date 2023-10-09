package Practice4;

public class ConcatenateString {
    public static void main(String[] args) {
        String[] str = { "Anna", "Mona", "siris", "josib", "rita" };
        String name = "";

        for (int i = 0; i < str.length; i++) {
            name += str[i];
            if (i < str.length - 1) {
                name += " ";
            }
        }
        System.err.println(name);
    }
}
