package by.teachmeskills.homeworks.hw_03032023.BankCard;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        CheckBankCard card = new CheckBankCard("12345789611234","платежная","Иванов","23.01.2024", "123");
        card.validateCard();
    }
}
