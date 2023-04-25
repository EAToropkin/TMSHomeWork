package by.teachmeskills.homeworks.hw_31032023.Streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayPath = new ArrayList<>();
        String valStr;
        Scanner scanner = new Scanner(System.in);

        boolean getNext = true;
        while (getNext) {
            System.out.println("Введите полный путь до файла. Для окончания ввода введите 0: ");
            valStr = scanner.nextLine();

            if (valStr.equals("0")) {
                getNext = false;
            } else {
                arrayPath.add(valStr);
            }
        }

        ValidatePath validatePath = new ValidatePath(arrayPath);
        validatePath.validate();
    }
}