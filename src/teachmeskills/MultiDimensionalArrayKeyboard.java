package teachmeskills;

import java.util.Scanner;

public class MultiDimensionalArrayKeyboard {

    public static void main(String[] args) {
        // Заполнение массива с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) { // length - количество элементов в строке
                System.out.println("Введите элемент array[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) { // length - количество строк в массиве
            for (int j = 0; j < array[i].length; j++) { // length - количество элементов в строке
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
