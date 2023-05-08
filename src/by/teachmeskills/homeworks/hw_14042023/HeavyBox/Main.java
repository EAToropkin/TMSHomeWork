package by.teachmeskills.homeworks.hw_14042023.HeavyBox;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(100);

        Consumer<HeavyBox> shipped = box -> System.out.println("Отгрузили " + box.getWeight());
        Consumer<HeavyBox> send = box -> System.out.println("Отправляем " + box.getWeight());
        Consumer<HeavyBox> allSend = shipped.andThen(send);

        allSend.accept(heavyBox);
    }
}