package by.teachmeskills.homeworks.hw_03032023.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("ToshibaHead speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
