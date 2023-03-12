package by.teachmeskills.homeworks.hw_03032023.BankCard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    private static class CheckBankCard {
        private static boolean isStrNumber(String str) {

            if (str == null) {
                return true;
            }

            if (str.length() == 0) {
                return true;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    return true;
                }
            }
            return false;
        }

        private static boolean isDate(String dateCard) {
            try {
                new SimpleDateFormat("dd.MM.yyyy").parse(dateCard);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }

        private static LocalDate getDate(String stringDateCard) {

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse("01.01.1991", dateFormat);

            if (isDate(stringDateCard)) {
                date = LocalDate.parse(stringDateCard, dateFormat);
            }
            return date;
        }

        private static boolean validateCard(String numCard, String kindCard, String FIO, String dateEnd, String svv) {
            boolean checkVal = true;
            System.out.println("Запуск проверки карты № " + numCard);

            LocalDate curDate = LocalDate.now();
            String kindCards = "дебетовая,кредитная,платежная";

            if (numCard.length() == 0) {
                System.out.println("Ошибка! Не указан номер карты");
                checkVal = false;
            }
            if (FIO.length() == 0) {
                System.out.println("Ошибка! Не указан владелей карты");
                checkVal = false;
            }
            if (!isDate(dateEnd)) {
                System.out.println("Ошибка! Некорректный формат даты");
                checkVal = false;
            } else {
                if (getDate(dateEnd).isBefore(curDate)) {
                    System.out.println("Ошибка! Срок действия карты истек");
                    checkVal = false;
                }
            }

            if (svv.length() != 3) {
                System.out.println("Ошибка! Длина CVV кода превышает три символа");
                checkVal = false;
            }
            if (isStrNumber(svv)) {
                System.out.println("Ошибка! CVV код должен содержать только числа");
                checkVal = false;
            }
            if (isStrNumber(numCard)) {
                System.out.println("Ошибка! Номер карты должен содержать только числа");
                checkVal = false;
            }
            if (numCard.length() < 13) {
                System.out.println("Ошибка! Номер в номере карты может быть от 13 до 19 цифр");
                checkVal = false;
            }
            if (!kindCards.contains(kindCard)) {
                System.out.println("Ошибка! Вид карты может быть только " + kindCards);
                checkVal = false;
            }
            if (checkVal) {
            System.out.println("Реквизиты карты " + numCard +" прошли проверку");
            } else {
                System.out.println("Реквизиты карты " + numCard +" не прошли проверку");
            }

            return checkVal;
        }
    }

    public static void main(String[] args) throws ParseException {
        CheckBankCard.validateCard("12345789611234", "платежная", "Иванов", "23.01.2024", "123");
        CheckBankCard.validateCard("12345789622221", "пластиковая", "Петров", "01.01.2022", "111");
    }
}
