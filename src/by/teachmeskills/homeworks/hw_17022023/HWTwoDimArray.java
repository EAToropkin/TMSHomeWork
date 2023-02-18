package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HWTwoDimArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int rows = scan.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int columns = scan.nextInt();

        int[][] aMas = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                aMas[i][j] = ((int) (Math.random() * 12) - 15);
                System.out.print(aMas[i][j] + " : ");
            }
            System.out.println();
        }
        System.out.println("Результат (четные/нечетные): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (aMas[i][j] % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.print("\n");
        }
    }
}
