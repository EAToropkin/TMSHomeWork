package by.teachmeskills.homeworks.hw_03032023.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("SonyHead speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
