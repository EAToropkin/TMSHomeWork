package by.teachmeskills.homeworks.hw_17022023;

public class HWBubleSort {
    public static void main(String[] args) {
        System.out.println(" -----  Пузырьковая сортировка (неотсортированный массив):  ---------------- ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Math.random();
            System.out.println(" aMasAdd " + i + ": " + array[i]);
        }
        boolean isSorted = false;
        double numTmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < 10 - 1; i++) {

                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    numTmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = numTmp;
                }
            }
        }
        System.out.println(" ----- Отсортированный массив : ---------------- ");

        for (int i = 0; i < 10; i++) {
            System.out.println(" aMasAdd " + i + ": " + array[i]);
        }
    }
}
