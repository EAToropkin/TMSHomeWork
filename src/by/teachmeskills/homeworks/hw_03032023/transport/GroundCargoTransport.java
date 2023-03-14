package by.teachmeskills.homeworks.hw_03032023.transport;

public class GroundCargoTransport extends GroundTransport {
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }




    @Override
    protected String getSpecification() {
        return super.getSpecification() + " Тоннаж: " + tonnage;
    }

    public void checkTonnage(int cntTonnage) {
        if (cntTonnage <= tonnage) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
