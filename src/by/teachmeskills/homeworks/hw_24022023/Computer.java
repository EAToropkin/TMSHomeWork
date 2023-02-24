package by.teachmeskills.homeworks.hw_24022023;
public class Computer {
    private String processType;
    private int amountRam;
    private int amountDisc;

    private boolean compStatus = true;

    private void setCompStatus(boolean status)
    {
        compStatus = status;
    }

    private boolean getCompStatus()
    {
        return compStatus;
    }
    public String getProcessType() {
        return processType;
    }
    public int getAmountRam() {
        return amountRam;
    }
    public int getAmountDisc() {
        return amountDisc;
    }

    private static boolean calcStatus(int num) {
        int checkVal = 0;
        if (Math.random() >= 0.5) {
            checkVal = 1;
        }

        return num == checkVal;
    }

    public void turnOn(int num) {
        if (!getCompStatus()) {
            System.out.println("Компьютеру конец");
            return;
        }

        if (calcStatus(num)) {
            System.out.println("Включили");
        } else{
            System.out.println("Компьютер сгорел");
            setCompStatus(false);
        }
    }

    public void turnOff(int num) {
        if (!getCompStatus()) {
            System.out.println("Компьютеру конец");
            return;
        }

        if (calcStatus(num)) {
            System.out.println("Выключили");
        } else{
            System.out.println("Компьютер сгорел");
            setCompStatus(false);
        }
    }

}

