package by.teachmeskills.homeworks.hw_03032023.transport;

public class AirPassengerTransport extends AirTransport {
    private int countPassenger;
    private boolean hasBusiness;

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public boolean isHasBusiness() {
        return hasBusiness;
    }

    @Override
    protected String getSpecification() {
        return super.getSpecification() + " Кол-во пассажиров " + countPassenger + " Наличие бизнес-класса" + (hasBusiness ? "Да" : "Нет");
    }

    public void checkCountPassenger(int cntPassenger) {
        if (cntPassenger <= countPassenger) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
