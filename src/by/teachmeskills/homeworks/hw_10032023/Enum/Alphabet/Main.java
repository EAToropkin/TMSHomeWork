package by.teachmeskills.homeworks.hw_10032023.Enum.Alphabet;

import java.util.Scanner;

public class Main {

    private static int getLetterPosition(String letter) {
        int pos = 0;
        try {
            pos = Alphabet.valueOf((letter.toUpperCase())).ordinal() + 1;
        } catch (IllegalArgumentException e) {
            System.out.println("Символ " + letter + " отсутствует в алфафите");
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите букву:");
        String letter = scan.next();
        System.out.println("Позиция буквы в алфафите: " + getLetterPosition(letter));
    }
}
