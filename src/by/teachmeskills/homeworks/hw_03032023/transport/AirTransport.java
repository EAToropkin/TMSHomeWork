package by.teachmeskills.homeworks.hw_03032023.transport;

public abstract class AirTransport extends Transport {
    protected int wingSpan;

    protected int lenghTakeOff;

    public void setLenghTakeOff(int lenghTakeOff) {
        this.lenghTakeOff = lenghTakeOff;
    }

    public int getLenghTakeOff() {
        return lenghTakeOff;
    }

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
