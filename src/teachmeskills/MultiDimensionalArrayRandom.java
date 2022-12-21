package teachmeskills;

import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalArrayRandom {

    public static void main(String[] args) {
        // Заполнение массива случайными числами рандомно
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) { // length - количество элементов в столбце
                array[i][j] = random.nextInt(10); // заполнение случайными числами
            }
        }
        for (int[] element : array) { // вывод на экран в виде таблицы
            System.out.println(Arrays.toString(element));
        }
    }
}
