package Practice2;

public class DupliEleInArr {
    public static void main(String[] args) {
        int[] numArray = { 2, 6, 7, 6, 2, 19 };
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    System.err.println("Duplicates elements found " + numArray[j]);
                }
            }
        }
    }
}