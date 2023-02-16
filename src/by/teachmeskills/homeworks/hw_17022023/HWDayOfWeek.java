package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;
public class HWDayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день недели (меньше 10): ");
        int nSideA = scan.nextInt();
        String sDayOfWeek;
        switch (nSideA) {
            case (1) ->  sDayOfWeek = "Понедельник";
            case (2) ->  sDayOfWeek = "Вторник";
            case (3) ->  sDayOfWeek = "Среда";
            case (4) ->  sDayOfWeek = "Четверг";
            case (5) ->  sDayOfWeek = "Пятница";
            case (6) ->  sDayOfWeek = "Суббота";
            case (7) ->  sDayOfWeek = "Воскресенье";
            default -> sDayOfWeek = "Указанное значение " + nSideA + " не является днем недели ";
        }
        System.out.println("День недели : " + sDayOfWeek);

    }
}
