package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class Transport {
    protected double power;
    protected int maxSpeed;
    protected double weight;
    protected String brand;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private double getPowerKW(double powerLs) {
        return powerLs * 0.74;
    }

    protected String getSpecification() {
        return "Марка " + brand + " Можщность: " + getPowerKW(power) + " Вес: " + weight + " Макс.скорость: " + maxSpeed + " Размах крыла ";
    }


}
