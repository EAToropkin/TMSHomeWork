package by.teachmeskills.homeworks.hw_03032023.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("SamsungHead speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
