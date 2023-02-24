package by.teachmeskills.homeworks.hw_24022023;

import java.util.Scanner;

public class TryOnComputer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 0 или 1: ");
        int num = scan.nextInt();

        if ((num != 0) && (num != 1)) {
            System.out.println("Ошибка! Необходимо ввести  0 или 1");
            return;
        }

        Computer computer = new Computer();

        computer.turnOn(num);
        computer.turnOff(num);
    }
}
