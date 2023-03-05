package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class AirTransport extends Transport {
    protected int wingSpan;

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    protected String getSpecification() {
        return super.getSpecification() + " Размах крыла " + wingSpan;
    }
}
