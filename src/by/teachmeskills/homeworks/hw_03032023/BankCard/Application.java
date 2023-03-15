package by.teachmeskills.homeworks.hw_03032023.BankCard;

public class Application {
    public static void main(String[] args) {

        Card card1 = new Card("12345789611234", "платежная", "Иванов", "23.01.2024", "123");
        Card card2 = new Card("12345789622221", "пластиковая", "Петров", "01.01.2022", "111");
        card1.validate();
        card2.validate();
    }
}
