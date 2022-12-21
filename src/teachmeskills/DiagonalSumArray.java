package teachmeskills;

import java.util.Arrays;
import java.util.Random;

public class DiagonalSumArray {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int[] arrayElement : array) {
            System.out.println(Arrays.toString(arrayElement));
        }

        int mainSum = 0;
        int additionalSum = 0;
        for (int i = 0; i < array.length; i++) {
            mainSum = mainSum + array[i][i];
        }

        for (int i = 0; i < array.length; i++) {
            additionalSum = additionalSum + array[i][array.length - i - 1];
        }

        System.out.println("Main diagonal sum is " + mainSum);
        System.out.println("Additional diagonal sum is " + additionalSum);
    }
}
