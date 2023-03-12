package by.teachmeskills.homeworks.hw_03032023.transport;

public class GroundPassengerTransport extends GroundTransport {
    private String carBody;
    private int countPassenger;

    public GroundPassengerTransport(String brand, String carBody, int maxSpeed, int fuelConsume, int countPassenger) {
        this.brand = brand;
        this.carBody = carBody;
        this.countPassenger = countPassenger;
        this.maxSpeed = maxSpeed;
        this.fuelConsume = fuelConsume;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }


    @Override
    protected String getSpecification() {
        return super.getSpecification() + "Тип кузова" + carBody + " Кол-во пассажиров " + countPassenger;
    }

    private double calcCountFuel(int distance) {
        return distance / fuelConsume;
    }

    public void calcDistance(int countTimeInHour) {
        int dist = maxSpeed * countTimeInHour;
        System.out.println("За время " + countTimeInHour +
                " часа автомобиль марки " + brand +
                ", двигаясь со скоростью " + maxSpeed +
                " км/ч проедет расстояние " + dist +
                " км, затратив при этом " + calcCountFuel(dist) +
                " литров топлива");
    }
}
