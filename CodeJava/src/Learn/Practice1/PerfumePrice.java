package Learn.Practice1;

import java.util.Scanner;

public class PerfumePrice {
    public static void main(String[] args) {

        int[] price = { 2320, 9430, 1125, 5320, 3320, 6320, 2965, 7570 };
        int min = price[0];
        for (int i = 0; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
                System.out.println("The cheapest cost of perfume in given shop");
                System.out.println(min);
            }
        }

    }
}
