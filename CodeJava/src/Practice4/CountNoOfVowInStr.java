package Practice4;

public class CountNoOfVowInStr {
    public static void main(String[] args) {
        String str = "HelloWorld to everyone";
        char[] c = str.toCharArray();
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vowel++;
        }
        System.out.println("The number of vowel in a String is " + vowel);
    }

}
