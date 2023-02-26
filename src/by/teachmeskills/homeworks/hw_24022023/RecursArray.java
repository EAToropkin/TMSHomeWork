package by.teachmeskills.homeworks.hw_24022023;

public class RecursArray {
    public static int sumArray(int[] arrayCalc, int n) {
        if (n == 0) {
            return arrayCalc[0];
        }
        return arrayCalc[n] + sumArray(arrayCalc, n - 1);
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11) + 1;
            System.out.print(array[i] + ";");
        }
        System.out.print("Сумма элементов = " + sumArray(array, array.length - 1));
    }
}
