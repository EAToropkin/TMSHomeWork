package by.teachmeskills.homeworks.hw_17032023.Auto;

import java.io.Serializable;

public class Automobile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String brand;
    private int speed;
    private double price;

    public Automobile(String brand, int speed, double price) {
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

    @Override
    public String toString() {
        return "Serialize{" +
                "brandInfo = " + brand +
                ", speedInfo=" + speed +
                ", priceInfo=" + price +
                '}';
    }
}