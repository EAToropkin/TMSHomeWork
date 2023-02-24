package by.teachmeskills.homeworks.hw_24022023;
import java.util.Scanner;
public class RecursYesNo {
    public static int isDegree(int numFirst, int numSecond) {
        if (numFirst >= numSecond) {
            if (numFirst == numSecond) {
                System.out.print("YES");
                }
            else {
                System.out.print("NO");
            };
            return numFirst;
        }
            numFirst = numFirst * 2;
            return isDegree(numFirst, numSecond);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int numSecond = scan.nextInt();
        isDegree(2, numSecond);
    }
}
