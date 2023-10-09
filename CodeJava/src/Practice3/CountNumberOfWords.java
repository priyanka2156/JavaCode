package Practice3;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the  sentence : ");
        String sent = sc.nextLine();
        String[] words = sent.split("\\s+");
        int wordCount = words.length;

        System.out.println(" Number of words in the sentence: " + wordCount);

    }

}
