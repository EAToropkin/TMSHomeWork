package by.teachmeskills.homeworks.hw_10032023.CarException;

import by.teachmeskills.homeworks.hw_10032023.CarException.exceptions.CarStartException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;

public class Car {
    private String brand;
    private int speed;
    private double price;

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws CarStartException {
        int maxInt = 20;
        int check = (int) (Math.random() * ++maxInt);

        if (check % 2 == 0) {
            throw new CarStartException("Ошибка запуска автомобиля " + brand);
        }
        System.out.println("Автомобиль " + brand + " завелся");
    }
}
