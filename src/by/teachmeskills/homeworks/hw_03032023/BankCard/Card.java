package by.teachmeskills.homeworks.hw_03032023.BankCard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Card {
    private String numCard;
    private String kindCard;
    private String fullName;
    private String dateEnd;
    private String cvv;

    public Card(String numCard, String kindCard, String fullName, String dateEnd, String cvv) {
        this.numCard = numCard;
        this.kindCard = kindCard;
        this.fullName = fullName;
        this.dateEnd = dateEnd;
        this.cvv = cvv;
    }

    public String getNumCard() {
        return numCard;
    }

    public String getKindCard() {
        return kindCard;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getCvv() {
        return cvv;
    }

    public boolean validate() {
        class CardValidator {
            private static boolean isCorrectNumber(String str) {
                if ((str == null) || (str.length() == 0)) {
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

            private static boolean validateCardDate(String dateEnd) {
                LocalDate curDate = LocalDate.now();
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                try {
                    new SimpleDateFormat("dd.MM.yyyy").parse(dateEnd);
                } catch (ParseException e) {
                    System.out.println("    Ошибка! Некорректный формат даты");
                    return false;
                }

                LocalDate date = LocalDate.parse(dateEnd, dateFormat);
                if (date.isBefore(curDate)) {
                    System.out.println("    Ошибка! Срок действия карты (" + dateEnd + ") истек");
                    return false;
                }
                return true;
            }

            private static boolean validateCardType(String kindCard) {
                String kindCards = "дебетовая,кредитная,платежная";
                if (!kindCards.contains(kindCard)) {
                    System.out.println("    Ошибка! Вид карты может быть только " + kindCards);
                    return false;
                }
                return true;
            }

            private static boolean validateCardNum(String numCard) {
                if (numCard.isEmpty()) {
                    System.out.println("    Ошибка! Не указан номер карты");
                    return false;
                }
                if (!isCorrectNumber(numCard)) {
                    System.out.println("    Ошибка! Номер карты должен содержать только числа");
                    return false;
                }
                if ((numCard.length() < 13) || (numCard.length() > 19)) {
                    System.out.println("    Ошибка! В номере карты должно быть от 13 до 19 цифр");
                    return false;
                }
                return true;
            }

            private static boolean validateCardOwner(String fullName) {
                if (fullName.isEmpty()) {
                    System.out.println("    Ошибка! Не указан владелей карты");
                    return false;
                }
                return true;
            }

            private static boolean validateCardCvv(String cvv) {
                if (cvv.length() != 3) {
                    System.out.println("    Ошибка! Длина CVV кода превышает три символа");
                    return false;
                }
                if (!isCorrectNumber(cvv)) {
                    System.out.println("    Ошибка! CVV код должен содержать только числа");
                    return false;
                }
                return true;
            }
        }

        boolean checkVal = true;
        System.out.println("Запуск проверки карты № " + getNumCard());

        // сделал отдельно вызов каждого метода чтобы было видно все ошибки
        if (!CardValidator.validateCardNum(getNumCard())) {
            checkVal = false;
        }
        if (!CardValidator.validateCardDate(dateEnd)) {
            checkVal = false;
        }
        if (!CardValidator.validateCardType(kindCard)) {
            checkVal = false;
        }
        if (!CardValidator.validateCardOwner(fullName)) {
            checkVal = false;
        }
        if (!CardValidator.validateCardCvv(cvv)) {
            checkVal = false;
        }

        if (checkVal) {
            System.out.println("Реквизиты карты № " + numCard + " прошли проверку");
        } else {
            System.out.println("Ошибка!!! Реквизиты карты № " + numCard + " не прошли проверку");
        }

        return checkVal;
    }
}
