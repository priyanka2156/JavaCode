package Practice2;

import java.util.Random;

public class RandomNumInArr {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 8, 10 };
        // int numEle = 2;
        // for (int i = 0; i < numEle; i++) {
        // int randomIndex = (int) (Math.random() * arr.length);
        // int randomEle = arr[randomIndex];
        // System.out.println(randomEle);
        // }

        String[] myArray = { "Apple", "Mango", "banana", "cherry", "orange", "grapes" };
        Random random = new Random();
        String randomEle = myArray[random.nextInt(myArray.length)];
        System.out.println(randomEle);

    }
}
