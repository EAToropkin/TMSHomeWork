package by.teachmeskills.homeworks.hw_03032023.robot;

import by.teachmeskills.homeworks.hw_03032023.robot.hands.SamsungHand;
import by.teachmeskills.homeworks.hw_03032023.robot.hands.SonyHand;
import by.teachmeskills.homeworks.hw_03032023.robot.hands.ToshibaHand;
import by.teachmeskills.homeworks.hw_03032023.robot.heads.SamsungHead;
import by.teachmeskills.homeworks.hw_03032023.robot.heads.SonyHead;
import by.teachmeskills.homeworks.hw_03032023.robot.heads.ToshibaHead;
import by.teachmeskills.homeworks.hw_03032023.robot.legs.SamsungLeg;
import by.teachmeskills.homeworks.hw_03032023.robot.legs.SonyLeg;
import by.teachmeskills.homeworks.hw_03032023.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        SonyHead sonyHead = new SonyHead(200);
        SamsungHead samsungHead = new SamsungHead(500);
        ToshibaHead toshibaHead = new ToshibaHead(300);

        SonyHand sonyHand = new SonyHand(100);
        SamsungHand samsungHand = new SamsungHand(500);
        ToshibaHand toshibaHand = new ToshibaHand(200);

        SonyLeg sonyLeg = new SonyLeg(500);
        SamsungLeg samsungLeg = new SamsungLeg(300);
        ToshibaLeg toshibaLeg = new ToshibaLeg(300);

        Robot robotFirst = new Robot(sonyHead, samsungHand, toshibaLeg);
        System.out.println("--- robotFirst Rise!");
        robotFirst.action();

        System.out.println("--- robotSecond Rise!");
        Robot robotSecond = new Robot(samsungHead, sonyHand, toshibaLeg);
        robotSecond.action();

        System.out.println("--- robotToshiba Rise!");
        Robot robotToshiba = new Robot(toshibaHead, toshibaHand, toshibaLeg);
        robotToshiba.action();

        System.out.println("Стоимость первого робота = " + robotFirst.getPrice());
        System.out.println("Стоимость второго робота = " + robotSecond.getPrice());
        System.out.println("Стоимость третьего робота = " + robotToshiba.getPrice());

        int[] array = {robotFirst.getPrice(), robotSecond.getPrice(), robotToshiba.getPrice()};
        int indMax = 0;
        int priceMax = -1;

        for (int i = 0; i<=2; i++) {
            if (array[i] >= priceMax) {
                priceMax = array[i];
                indMax = i + 1;
            }
        }
        System.out.println("Самый дорогой робот № " + indMax);

    }
}
