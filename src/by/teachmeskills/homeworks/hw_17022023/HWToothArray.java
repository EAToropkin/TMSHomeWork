package by.teachmeskills.homeworks.hw_17022023;
public class HWToothArray {
    public static void main(String[] args) {
        int[][] array = new int[5][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(int) (Math.random() * 11)];

            System.out.println("Кол-во элементов " + array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 12) - 15);
                System.out.print(array[i][j] + " : ");
            }
            System.out.println();
        }
    }
}
