package by.teachmeskills.homeworks.hw_24022023;
import java.util.Scanner;
public class RecursTwoNumber {
    public static int printNum(int numFirst, int numSecond) {
        if (numFirst == numSecond) {
            System.out.print(numFirst + ";");
            return numFirst;
        }
        System.out.print(numFirst + ";");
        if (numFirst < numSecond) {
            numFirst++;
            return printNum(numFirst, numSecond);
        } else {
            numFirst--;
            return printNum(numFirst, numSecond);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int numFirst = scan.nextInt();
        System.out.println("Введите второе целое число: ");
        int numSecond = scan.nextInt();

        if (numFirst == numSecond) {
            System.out.println("Ошибка! Числа равны");
        } else {
            printNum(numFirst, numSecond);
        }
    }
}
