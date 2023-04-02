package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class GroundTransport extends Transport {
    protected int countWheels;
    protected int fuelConsume;

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getFuelConsume() {
        return fuelConsume;
    }

    public void setFuelConsume(int fuelConsume) {
        this.fuelConsume = fuelConsume;
    }

    protected String getSpecification() {
        return super.getSpecification() + " Кол-во колес " + countWheels + " Запас топлива " + fuelConsume;
    }
}