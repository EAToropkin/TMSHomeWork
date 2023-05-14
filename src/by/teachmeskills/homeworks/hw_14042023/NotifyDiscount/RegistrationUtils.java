package by.teachmeskills.homeworks.hw_14042023.NotifyDiscount;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public final class RegistrationUtils {

    private boolean validateStringField(String str) {
        if (str.isEmpty() || str.trim() == "") {
            return false;
        }
        return true;
    }

    private boolean validateBirthDate(String birthDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            Date parseDate = simpleDateFormat.parse(birthDate);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private boolean validateData(DiscountCard discountCard) {

        if (!validateStringField(discountCard.getFio())) {
            System.out.println("Ошибка! Не указано ФИО клиента");
            return false;
        }

        if (!validateBirthDate(discountCard.getBirthDate())) {
            System.out.println("Ошибка! Некорректно указана Дата рождения " + discountCard.getBirthDate() + ". Должна быть в формате yyyy-mm-dd");
            return false;
        }

        if (!validateStringField(discountCard.getGender())) {
            System.out.println("Ошибка! Не указан пол клиента");
            return false;
        }

        String contact = discountCard.getContact();

        if (contact.startsWith("+")) {
            if (!contact.startsWith("+37529")
                    && !contact.startsWith("+37525")
                    && !contact.startsWith("+37524")
                    && !contact.startsWith("+37544")
                    && !contact.startsWith("+37533")
            ) {
                System.out.println("Ошибка! Некорректно указан номер телефона " + contact + ". Должен начинаться с +375. Номера операторов:29/25/24/44/33");
                return false;
            }
        } else if (!contact.contains("@")) {
            System.out.println("Ошибка! Некорректно указан номер контакта " + contact + ". Необходимо указать номер телефона или электронную почту");
        }
        return true;
    }

    private DiscountCard readUserData() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String inputFio = scan.nextLine();

        System.out.println("Ведите пол: ");
        String inputGender = scan.nextLine();

        System.out.println("Введите дату рождения в формате yyyy-mm-dd: ");
        String inputBirhDate = scan.nextLine();

        System.out.println("Введите телефон/эл.почту: ");
        String inputContact = scan.nextLine();

        DiscountCard discountCard = new DiscountCard(inputFio, inputGender, inputBirhDate, inputContact);

        return discountCard;
    }

    private void createUserFile(DiscountCard discountCard, String fileName) {

        File file = new File(fileName);
        boolean doWhile = true;

        ArrayList<DiscountCard> list = new ArrayList<>();

        if (file.exists()) {

            try (FileInputStream fileInputStream = new FileInputStream(fileName);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                while (doWhile) {
                    try {
                        DiscountCard card = (DiscountCard) objectInputStream.readObject();
                        list.add(card);
                    } catch (EOFException e) {
                        doWhile = false;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        list.add(discountCard);

        try (FileOutputStream outputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            for (int i = 0; i < list.size(); i++) {
                objectOutputStream.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void createUserData(String fileName) {
        DiscountCard discountCard = readUserData();

        if (validateData(discountCard)) {
            createUserFile(discountCard, fileName);
        }
    }
}