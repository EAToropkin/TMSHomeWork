package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HWDayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день недели (меньше 10): ");
        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            case (4) -> System.out.println("Четверг");
            case (5) -> System.out.println("Пятница");
            case (6) -> System.out.println("Суббота");
            case (7) -> System.out.println("Воскресенье");
            default -> System.out.println("Указанное значение " + dayOfWeek + " не является днем недели");
        }
    }
}
