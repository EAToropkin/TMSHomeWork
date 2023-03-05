package by.teachmeskills.homeworks.hw_03032023.BankCard;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;

public class CheckBankCard {
    private String numCard;
    private String kindCard;
    private String FIO;
    private String dateEnd;
    private String svv;

    public CheckBankCard(String numCard, String kindCard, String FIO, String dateEnd, String svv) {
        this.numCard = numCard;
        this.kindCard = kindCard;
        this.FIO = FIO;
        this.dateEnd = dateEnd;
        this.svv = svv;
    }

    private boolean isNumber(String str) {

        if (str == null) {
            return false;
        }

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }


    private boolean isDate(String dateCard) {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY");

        try {
            new SimpleDateFormat("dd.MM.yyyy").parse(dateCard);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private LocalDate getDate(String stringDateCard) throws ParseException {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse("01.01.1991", dateFormat);
        ;

        if (isDate(stringDateCard)) {
            System.out.println("Это дата " );
            date = LocalDate.parse(stringDateCard, dateFormat);
        }
        return date;
    }

    public boolean validateCard() throws ParseException {
        boolean checkVal = true;
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
        if (!isNumber(svv)) {
            System.out.println("Ошибка! CVV код должен содержать только числа");
            checkVal = false;
        }
        if (!isNumber(numCard)) {
            System.out.println("Ошибка! Номер карты должен содержать только числа");
            checkVal = false;
        }
        if (numCard.length() < 13) {
            System.out.println("Ошибка! Номер в номере карты может быть от 13 до 19 цифр");
            checkVal = false;
        }
        if (kindCards.indexOf(kindCard) == -1) {
            System.out.println("Ошибка! Вид карты может быть только " + kindCards);
            checkVal = false;
        }
        System.out.println("Реквизиты карты прошли проверку");
        return checkVal;
    }
}
