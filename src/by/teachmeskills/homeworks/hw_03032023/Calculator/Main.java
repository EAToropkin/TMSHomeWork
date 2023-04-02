package by.teachmeskills.homeworks.hw_03032023.Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 0);
        System.out.println("Результат умножения = " + calc.getMultiplication());
        System.out.println("Результат сложения = " + calc.getSumma());
        System.out.println("Результат вычитания = " + calc.getDifference());
        System.out.println("Результат деления = " + calc.getDivision());
    }
}
