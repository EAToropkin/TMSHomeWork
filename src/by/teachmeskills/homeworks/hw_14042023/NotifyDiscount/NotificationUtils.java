package by.teachmeskills.homeworks.hw_14042023.NotifyDiscount;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public final class NotificationUtils {

    final static String shopName = "Сто товаров";
    final static String productName = "Товар 1, Товар 2, Товар 3";

    final static String messageBefore = "Уважаемый(-моя) <ФИО>, магазин <Имя магазина> в Ваш День рождения дарит Вам в скидку 15% на следующие товары: <список товаров>. " +
            "Скидка действует с <Дата начала> до <Дата окончания>. Будем рады видеть Вас в нашем магазине.";

    final static String messageBirthday = "Уважаемый(-моя) <ФИО>, магазин <Имя магазина> поздравляет Вас с Днем рождения и дарит Вам в скидку 15% на следующие товары: <список товаров>. " +
            "Скидка действует с <Дата начала> до <Дата окончания>. Будем рады видеть Вас в нашем магазине.";

    final static String messageOneDay = "Уважаемый(-моя) <ФИО>, магазин <Имя магазина> напоминает Вам про скидку 15% на следующие товары: <список товаров>. " +
            "Скидка действует с <Дата начала> до <Дата окончания>. Будем рады видеть Вас в нашем магазине.";

    private static void sendNofication(DiscountCard card, int typeMessage) {

        if (typeMessage == 0) {
            return;
        }
        String message = null;

        switch (typeMessage) {
            case (1) -> message = messageBefore;
            case (2) -> message = messageBirthday;
            case (3) -> message = messageOneDay;
        }

        message = message.replace("<Имя магазина>", shopName);
        message = message.replace("<ФИО>", card.getFio());
        message = message.replace("<список товаров>", productName);

        System.out.println(message);
    }

    private static int getTypeNotification(DiscountCard card) {
        LocalDate curDate = LocalDate.now();

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate;

        birthDate = LocalDate.parse(card.getBirthDate(), formatDate);
        int countYear = curDate.getYear() - birthDate.getYear();

        birthDate = birthDate.plusYears(countYear);

        long countDays = birthDate.until(curDate, ChronoUnit.DAYS);

        if (countDays == 0) {
            return 1;
        } else if (countDays == 7) {
            return 2;
        } else if (countDays == 1) {
            return 3;
        }
        return 0;
    }

    public void sendNotification(String fileName) {

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            while (true) {
                try {
                    DiscountCard card = (DiscountCard) objectInputStream.readObject();
                    sendNofication(card, getTypeNotification(card));
                } catch (EOFException e) {
                    return;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}