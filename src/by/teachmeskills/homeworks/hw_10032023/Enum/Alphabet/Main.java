package by.teachmeskills.homeworks.hw_10032023.Enum.Alphabet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите букву:");
        String letter = scan.next();
        System.out.println("Позиция буквы в алфафите: " + Alphabet.getLetterPosition(letter));
    }
}
