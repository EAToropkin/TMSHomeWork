package by.teachmeskills.homeworks.hw_10032023.CarException;

import by.teachmeskills.homeworks.hw_10032023.CarException.exceptions.CarStartException;

public class Main {
    public static void main(String[] args) {
        Car carToyota = new Car("Тойота", 180, 8.5);
        Car carMazda = new Car("Mazda", 200, 6.5);
        Car carFord = new Car("Ford", 180, 10.5);

        Car[] arrayCar = {carToyota, carMazda, carFord};

        for (int i = 0; i < arrayCar.length; i++) {
            try {
                arrayCar[i].start();
            } catch (CarStartException e) {
                System.out.println("Ошибка при запуске автомобиля " + arrayCar[i].getBrand());
            }
        }
    }
}
