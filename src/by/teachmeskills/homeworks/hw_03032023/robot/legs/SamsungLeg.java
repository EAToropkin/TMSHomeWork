package by.teachmeskills.homeworks.hw_03032023.robot.legs;

import by.teachmeskills.homeworks.hw_03032023.robot.heads.IHead;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("SamsungLeg step forward");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
