package teachmeskills;

import java.util.Random;

public class AverageValue {

    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        int sum = 0;
        for (int arrayElement : array) { // foreach
            sum += arrayElement; // sum = sum + arrayElement
        }
        double average = (double) sum / array.length;
        System.out.println("Average value: " + average);
    }
}
