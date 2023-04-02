package by.teachmeskills.homeworks.hw_03032023.transport;

public class AirMilitaryTransport extends AirTransport {
    private boolean hasCatapult;
    private int countMissle;

    public int getCountMissle() {
        return countMissle;
    }

    public void setCountMissle(int countMissle) {
        this.countMissle = countMissle;
    }

    public boolean isHasCatapult() {
        return hasCatapult;
    }

    public void setHasCatapult(boolean hasCatapult) {
        this.hasCatapult = hasCatapult;
    }

    @Override
    protected String getSpecification() {
        return super.getSpecification() + " Наличие катапульты " + (hasCatapult ? "Да" : "Нет");
    }

    public void checkCountMissle(int cntMissle) {
        if (cntMissle <= countMissle) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkCatapult() {
        if (hasCatapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У Вас нет такой системы");
        }
    }
}
